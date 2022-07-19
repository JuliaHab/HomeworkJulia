package selenium7two;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest2 {
    private WebDriver driver;
    private String url;

    @BeforeMethod
    public void startBeforeEveryTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        url = "https://bbb.testpro.io/";
    }

    @AfterMethod
    public void tierDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test

    public void loginTest_pozitive(){
        LoginPage2 LoginPage = new LoginPage2(driver);
        LoginPage.navigate(url);
        MainPage2 mainPage = LoginPage.logginToKoel("Flower_cool@mail.ru", "3103-juliana");
        Assert.assertTrue(mainPage.isMainPage());
    }

    @Test

    public void  LoginTest_negative(){
        LoginPage2 LoginPage = new LoginPage2(driver);
        LoginPage.navigate(url);
        LoginPage.logginToKoel("Flower_cool@mail.ru", "wrongpassword");

    }
}

