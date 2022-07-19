package selenium7.pageObjectTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium7.pageObjects.LoginPageFactory;
import selenium7.pageObjects.MainPage;

public class LoginFactoryTest extends BaseTest{

    @Test
    public void loginPageFactory_correctLogin(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        MainPage mainPage = loginPageFactory.loginToApp(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }

    @Test
    public void loginFactory_incorrectCredentials(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.open(url);
        MainPage mainPage = loginPageFactory.loginToApp(username,errorPassword);
        Assert.assertTrue(loginPageFactory.isErrorFrame());
    }
}
