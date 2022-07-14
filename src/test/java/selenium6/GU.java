package selenium6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GU {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void startBeforeEveryTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5, 200);
        driver.get("https://www.gosuslugi.ru/");
    }

    @AfterMethod
    private void endAfterEveryTest() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void LoginGU() throws InterruptedException {

        By loginButtonLocator2 = By.xpath("//*[@class=\"link ng-star-inserted\"]");
        WebElement loginButton2 = driver.findElement(loginButtonLocator2);
        loginButton2.click();
        Thread.sleep(1000);

        By emailFieldLocator = By.xpath("//*[@id='login']");
        WebElement emailField = driver.findElement(emailFieldLocator);
        emailField.sendKeys("");
        Thread.sleep(2000);

        By passwordFieldLocator = By.cssSelector("[id=\"password\"]");
        WebElement passwordField = driver.findElement(passwordFieldLocator);
        passwordField.sendKeys("");
        Thread.sleep(2000);

        By loginButtonLocator = By.xpath("//*[@class=\"mb-24\"]");
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();

        By nameLocator1 = By.xpath("href=https://www.gosuslugi.ru/newsearch");
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameLocator1));
        WebElement nameLocator = driver.findElement(nameLocator1);
        Assert.assertTrue(nameLocator.isDisplayed());
        }
}

