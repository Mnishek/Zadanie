import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Zadanie2 {

    @Test
    public void login(){
        WebDriver test = new FirefoxDriver();
        test.get("http://the-internet.herokuapp.com");
        test.manage().window().maximize();
        WebElement cssClick = test.findElement(By.cssSelector("a[href='/login']"));
        cssClick.click();
        test.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement cssLog = test.findElement(By.id("username"));
        cssLog.sendKeys("LOlipop");
        WebElement cssPass = test.findElement(By.id("password" ));
        cssPass.sendKeys("123456");
        test.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement cssClick2 = test.findElement(By.cssSelector(".radius"));
        cssClick2.click();
        test.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement cssErorr = test.findElement(By.id("flash"));
        Assert.assertTrue(true);
        test.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        test.quit();


    }

}
