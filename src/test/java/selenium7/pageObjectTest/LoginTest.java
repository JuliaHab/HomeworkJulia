package selenium7.pageObjectTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium7.pageObjects.LoginPage;
import selenium7.pageObjects.MainPage;

public class LoginTest {

    // прописываются сами тесты (очень похожи на тест-кейсы)

    private WebDriver driver;
    private String url;

    @BeforeMethod
    public void startBeforeEveryTest(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        url = "https://bbb.testpro.io";
    }

    @AfterMethod
    public void endAfterEveryTest() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void LoginTest_correct_credentials_LoggedToApp(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigete(url);                             // предусловие
        MainPage mainPage = loginPage.loginToApp("Flower_cool@mail.ru","3103-juliana"); // шаги
        Assert.assertTrue(mainPage.isMainPage()); // результат
    }

    @Test
    public void LoginTest_incorrectCredentials_redFrame(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigete(url);
        loginPage.loginToApp("Flower_cool@mail.ru","errorPassword");
        Assert.assertTrue(loginPage.isRedFrame());
    }
}
