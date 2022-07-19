package selenium7.pageObjectTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium7.pageObjects.LoginPage;
import selenium7.pageObjects.MainPage;

public class PlaylistTest extends BaseTest{

    @Test
    public void playlistTest_createPlaylist_playlistCreated (){
        String playlistName = faker.country().capital();
//        String playlistName = TestDataGenerator.randomString(7);
        System.out.println(playlistName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigete(url);
        MainPage mainPage = loginPage.loginToApp("Flower_cool@mail.ru","3103-juliana");
        String playlistId = mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.checkPlaylist(playlistId,playlistName)); // проверка созданного плейлиста по id и названию
    }

    @Test
    public void plailistTest_renamePlaylist_playlistRenamed(){
        String playlistName = faker.country().capital();
        System.out.println(playlistName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigete(url);
        MainPage mainPage = loginPage.loginToApp("Flower_cool@mail.ru","3103-juliana");
        String playlistId = mainPage.createPlaylist(playlistName);
        String newName = faker.ancient().god();
        System.out.println(newName);
        mainPage.renamePlaylist(playlistId,newName);
        Assert.assertTrue(mainPage.checkPlaylist(playlistId,newName));
    }
}
