package selenium7.pageObjectTest;

import Helper.BrowserFabric;
import com.github.javafaker.Faker;
import enums.BrowserTypes;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    protected String url;
    protected Faker faker;
    protected String username;
    protected String password;
    protected String errorPassword;

    @BeforeMethod
    public void startBeforeEveryTest(){
        BrowserTypes type = BrowserTypes.FIREFOX;
        driver = BrowserFabric.getDriver(type);

        url = "https://bbb.testpro.io";
        faker = new Faker();
        username = "Flower_cool@mail.ru";
        password = "3103-juliana";
        errorPassword = "errorPassword";
    }

    @AfterMethod
    public void endAfterEveryTest() {
        driver.quit();
    }
}
