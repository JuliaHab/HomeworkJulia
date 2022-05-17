package selenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Koel3 {

    // рефакторинг - улучшение кода без изменения входящих и исходящих данных
    // выносим метод до теста и после теста, это поможет не писать одинаковую часть снова и снова в @Test
    /* суть: прописано 2 ранзых @Test ниже, сначало программа начнет метод Before и пройдет его, затем пройдет первый
    @Test, далее начнется метод After, в котором браузер закроется. Затем подет проверка второго @Test, перед ним снова
    будет пройден метод Before, а после будет пройден метод After */

    private WebDriver driver;

    @BeforeMethod
    public void startBeforeEveryTest(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io");
    }

    @AfterMethod
    public void endAfterEveryTest() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void loginToKoel_incorrectLogin() throws InterruptedException {

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
    }

    @Test
    public void loginToKoel() throws InterruptedException {

        By emailFieldLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);
        emailField.sendKeys("Flower_cool@mail.ru");

        By passwordFieldLocator = By.cssSelector("[type=\"password\"]");
        WebElement passwordField = driver.findElement(passwordFieldLocator);
        passwordField.sendKeys("3103-juliana");

        By loginButtonLocator = By.xpath("//*[@type=\"submit\"]");
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
        Thread.sleep(2000);

        By homeIconLocator = By.className("home");
        WebElement homeIcon = driver.findElement(homeIconLocator);
        Assert.assertTrue(homeIcon.isDisplayed());
    }
}
