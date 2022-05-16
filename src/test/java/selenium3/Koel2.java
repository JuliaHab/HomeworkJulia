package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Koel2 {

    @Test
    public void loginToKoel_incorrectLogin() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io");

        By emailFieldLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);
        emailField.sendKeys("Flower_cool@mail.ru");

        By passwordFieldLocator = By.cssSelector("[type=\"password\"]");
        WebElement passwordField = driver.findElement(passwordFieldLocator);
        passwordField.sendKeys("errorPassword");

        By loginButtonLocator = By.xpath("//*[@type=\"submit\"]");
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
        Thread.sleep(300);

        By errorFrameLocator = By.className("error");
        WebElement errorFrame = driver.findElement(errorFrameLocator);
        Assert.assertTrue(errorFrame.isDisplayed());

        Thread.sleep(5000);
        driver.quit();
    }
}
