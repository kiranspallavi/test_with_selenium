package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Seleniumtest {

    WebDriver driver;


@BeforeClass
public void setUp(){

    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://practice.expandtesting.com/login");
}

@AfterClass
public void tearDown() {
    driver.quit();
}


@Test
public void testlogging() throws InterruptedException{

    Thread.sleep(1000);

    WebElement username = driver.findElement(By.name("username"));
    username.sendKeys("practice");

    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys("SuperSecretPassword!");

    driver.findElement(By.id("submit-login")).click();

}
}

