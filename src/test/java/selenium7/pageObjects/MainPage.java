package selenium7.pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.NoSuchElementException;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
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

    private WebElement getIconPlus(){
        By iconPlusLocator = By.xpath("//*[@class=\"fa fa-plus-circle create\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(iconPlusLocator));
        return driver.findElement(iconPlusLocator);
    }

    private WebElement getButtonNewPlaylist(){
        By buttonNewPlaylistLocator = By.xpath("//*[@class=\"menu playlist-menu\"]/ul/li[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonNewPlaylistLocator));
        return driver.findElement(buttonNewPlaylistLocator);
    }

    private WebElement getFieldNamePlaylist(){
        By fieldNamePlaylist = By.xpath("//*[@class=\"create\"]/input");
        return driver.findElement(fieldNamePlaylist);
    }

    public String createPlaylist(String playlistName) {
        getIconPlus().click();
        getButtonNewPlaylist().click();
        getFieldNamePlaylist().sendKeys(playlistName);
        getFieldNamePlaylist().sendKeys(Keys.ENTER); // нажатие Enter
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']"))); // ждем зеленую рамку, подверждающую создание плейлиста
        return driver.getCurrentUrl().split("/")[5]; // вытаскиваем из url id созданного плейлиста (split делит url на части с учетом "/", а потом мы вызываем его 6 часть)
    }

    private WebElement getPlaylist(String playlistId){
        return driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']")); // ищем xpath созданного плейлиста, но он меняется в зависимости от id, поэтому мы вставляем найденое id ранее
    }

    public boolean checkPlaylist(String playlistId, String playlistName){   // это проверка созданного плейлиста - Assert
        try{
            return getPlaylist(playlistId).isDisplayed() && getPlaylist(playlistId).getText().equals(playlistName); // условия: id и название плейлиста, если все условия верные, возвращает true
        } catch (NoSuchElementException err){
            return false;
        }
    }

    public void renamePlaylist(String playlistId, String newName) {

    }
}
