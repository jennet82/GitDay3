package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class LoginTests {

    WebDriver driver;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test(priority = 1)
    public void loginTest1() throws Exception{
     driver.get("http://practice.cybertekschool.com");
     Thread.sleep(1000);
     driver.findElement(By.cssSelector("a[href='/checkboxes']")).click();
     Thread.sleep(1000);
     driver.findElement(By.cssSelector("[type='checkbox']:nth-of-type(1)")).click();
     Thread.sleep(1000);
    }

    @Test(priority = 2)
    public void loginTest2 () throws Exception{
        driver.get("http://qa2.vytrack.com/user/login");
        Thread.sleep(2000);

    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }

}
