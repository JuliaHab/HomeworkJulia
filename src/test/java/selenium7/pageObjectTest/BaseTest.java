package selenium7.pageObjectTest;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    protected String url;
    protected Faker faker;

    @BeforeMethod
    public void startBeforeEveryTest(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        url = "https://bbb.testpro.io";
        faker = new Faker();
    }

    @AfterMethod
    public void endAfterEveryTest() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
