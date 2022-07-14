package selenium7hw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium7.pageObjects.LoginPage;
import selenium7.pageObjects.MainPage;
import selenium7.pageObjects.PlaylistPage;

public class PlaylistTest {

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
    public void playlistTest_createPlaylist_playlistCreated (){
        String playlistName = "XXXXXXX";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigete(url);
        MainPage mainPage = loginPage.loginToApp("Flower_cool@mail.ru","3103-juliana");
        PlaylistPage playlistPage = mainPage.createPlaylist(playlistName);
        Assert.assertTrue(playlistPage.isMyPlaylist());
    }
}
