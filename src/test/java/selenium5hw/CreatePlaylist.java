package selenium5hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreatePlaylist {

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
    public void createPlaylist () throws InterruptedException {

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

        By createPlaylist = By.xpath("//*[@class=\"fa fa-plus-circle create\"]");
        WebElement clickCreatePlaylist = driver.findElement(createPlaylist);
        clickCreatePlaylist.click();
        Thread.sleep(2000);

        By newCreatePlaylist = By.xpath("//*[text()='New Playlist']");
        WebElement clickNewPlaylist = driver.findElement(newCreatePlaylist);
        clickNewPlaylist.click();

        By fieldNamePlaylist = By.xpath("//*[@class=\"create\"]/input");
        WebElement namePlaylist = driver.findElement(fieldNamePlaylist);
        namePlaylist.sendKeys("New Music");
    }
}
