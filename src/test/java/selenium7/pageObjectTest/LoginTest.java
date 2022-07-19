package selenium7.pageObjectTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium7.pageObjects.LoginPage;
import selenium7.pageObjects.MainPage;

public class LoginTest extends BaseTest{

    // прописываются сами тесты (очень похожи на тест-кейсы)

    @Test
    public void LoginTest_correct_credentials_LoggedToApp(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigete(url);                             // предусловие
        MainPage mainPage = loginPage.loginToApp(username,password); // шаги
        Assert.assertTrue(mainPage.isMainPage()); // результат
    }

    @Test
    public void LoginTest_incorrectCredentials_redFrame(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigete(url);
        loginPage.loginToApp(username,errorPassword);
        Assert.assertTrue(loginPage.isRedFrame());
    }
}
