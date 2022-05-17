package selenium3and4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

// Login
public class Koel {

    @Test
    // загрузка страницы в браузере
    public void loginToKoel() throws InterruptedException {

        // подтянули драйвера и сказали открыть браузер и какой именно
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io");

        // установили локатор xPath по элементу email, потом сказали браузеру найти по локатору элемент, затем прописать в нем что-то
        By emailFieldLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);
        emailField.sendKeys("Flower_cool@mail.ru");

        // установили локатор xPath по элементу password, потом сказали браузеру найти по локатору элемент, затем прописать в нем что-то
        By passwordFieldLocator = By.cssSelector("[type=\"password\"]");
        WebElement passwordField = driver.findElement(passwordFieldLocator);
        passwordField.sendKeys("3103-juliana");

        // установили локатор xPath по элементу button, потом сказали браузеру найти по локатору элемент, затем нажать на данную кнопку
        By loginButtonLocator = By.xpath("//*[@type=\"submit\"]");
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
        Thread.sleep(2000); // дали немного времени загрузится странице перед поиском кнопки home

        By homeIconLocator = By.className("home");
        WebElement homeIcon = driver.findElement(homeIconLocator);
        Assert.assertTrue(homeIcon.isDisplayed());

        // прописали через какое время закрыть браузер (указано 5 секунд)
        Thread.sleep(5000);
        driver.quit();
    }

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
