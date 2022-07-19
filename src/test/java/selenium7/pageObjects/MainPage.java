package selenium7.pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.awt.*;
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
        By buttonNewPlaylistLocator = By.xpath("//*[@data-testid=\"playlist-context-menu-create-simple\"]");
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

    private WebElement getFieldPlaylistName(String playlistId){
        By FieldPlaylistName = By.xpath("//*[@class='playlist playlist editing']/input");
        wait.until(ExpectedConditions.elementToBeClickable(FieldPlaylistName));  // новый вид wait: ждет условия когда на элемент возмоно будет нажать
        return driver.findElement(FieldPlaylistName);
    }

     public void renamePlaylist(String playlistId, String newName) {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",getPlaylist(playlistId)); // строчка 72 и 73 воспроизводит действие скролл до определенного элемента
        Actions action = new Actions(driver);
        action.doubleClick(getPlaylist(playlistId)).perform(); // строчка 74 и 75 воспроизводит двойной щелчок по элементу
        getFieldPlaylistName(playlistId).sendKeys(Keys.CONTROL+"a"); // восроизвели клавиши для выделение полного текста
        getFieldPlaylistName(playlistId).sendKeys(newName); // вставили новый текст
        getFieldPlaylistName(playlistId).sendKeys(Keys.ENTER);
        By secondGreenLocator = By.xpath("//*[@class='success show' and contains(text(),'"+newName+"')]"); // второй зеленый баннер, который имеет текст нового названия плейлиста
        wait.until(ExpectedConditions.visibilityOfElementLocated(secondGreenLocator));
        }
}
