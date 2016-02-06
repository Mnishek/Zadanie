import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Marina on 06.02.16.
 */
public class FailPassword {
    @Test
    public void login(){
        WebDriver failPassword = new FirefoxDriver();
        failPassword.get("http://the-internet.herokuapp.com");
        failPassword.manage().window().maximize();
        WebElement cssClick = failPassword.findElement(By.cssSelector("a[href='/login']"));
        cssClick.click();
        failPassword.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement cssLogin = failPassword.findElement(By.id("username"));
        cssLogin.sendKeys("tomsmith");
        WebElement cssPassword = failPassword.findElement(By.id("password" ));
        cssPassword.sendKeys("1234");
        WebElement cssButtom = failPassword.findElement(By.cssSelector(".radius"));
        cssButtom.click();
        WebElement cssOk = failPassword.findElement(By.id("flash"));
        Assert.assertTrue(cssOk.getText().contains("Your password is invalid!"));
        failPassword.quit();


    }

}
