import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by Marina on 06.02.16.
 */
public class Part2 {
    @Test
    public void login(){
        WebDriver test = new FirefoxDriver();
        test.get("http://the-internet.herokuapp.com");
        test.manage().window().maximize();
        WebElement cssClick = test.findElement(By.cssSelector("a[href='/login']"));
        cssClick.click();
        test.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement cssLog = test.findElement(By.id("username"));
        cssLog.sendKeys("tomsmith");
        WebElement cssPass = test.findElement(By.id("password" ));
        cssPass.sendKeys("SuperSecretPassword!");
        WebElement cssClick2 = test.findElement(By.cssSelector(".radius"));
        cssClick2.click();
        WebElement cssOk = test.findElement(By.id("flash"));
        Assert.assertTrue(cssOk.getText().contains("You logged into a secure area!"));
        test.quit();


    }



}
