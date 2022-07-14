package selenium7.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaylistPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public PlaylistPage (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,5,2000);
    }

    public boolean isMyPlaylist() {
        By myPlaylistLocator = By.xpath("//*[@class=\"playlist playlist\"]");
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(myPlaylistLocator));
            return true;
        } catch (TimeoutException err){
            return false;
        }
    }
}
