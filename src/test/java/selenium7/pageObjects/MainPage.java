package selenium7.pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,5, 2000);
    }

    public boolean isMainPage() {
        By homeIconLocator = By.className("home");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(homeIconLocator));
            return true;
        } catch (TimeoutException err){
            return false;
        }
    }

    private WebElement getCreatePlaylist(){
        By createPlaylist = By.xpath("//*[@class=\"fa fa-plus-circle create\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(createPlaylist));
        return driver.findElement(createPlaylist);
    }

    private WebElement getNewCreatePlaylist(){
        By newCreatePlaylist = By.xpath("//*[@class=\"menu playlist-menu\"]/ul/li[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(newCreatePlaylist));
        return driver.findElement(newCreatePlaylist);
    }

    private WebElement getFieldNamePlaylist(){
        By fieldNamePlaylist = By.xpath("//*[@class=\"create\"]/input");
        return driver.findElement(fieldNamePlaylist);
    }

    public PlaylistPage createPlaylist(String playlistName) {
        getCreatePlaylist().click();
        getNewCreatePlaylist().click();
        getFieldNamePlaylist().sendKeys(playlistName);
        getFieldNamePlaylist().sendKeys(Keys.ENTER);
        return new PlaylistPage(driver);
    }
}
