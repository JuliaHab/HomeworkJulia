package selenium7.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getEmailField(){
        By emailFieldLocator = By.xpath("//*[@type='email']");
        return driver.findElement(emailFieldLocator);
    }

    private WebElement getPasswordField(){
        By passwordFieldLocator = By.cssSelector("[type=\"password\"]");
        return driver.findElement(passwordFieldLocator);
    }

    private WebElement getButtonField(){
        By loginButtonLocator = By.xpath("//*[@type=\"submit\"]");
        return driver.findElement(loginButtonLocator);
    }

    public MainPage loginToApp(String username, String password){
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getButtonField().click();
        return new MainPage(driver);
    }

    public void navigete(String url){
        driver.get(url);
    }

    public boolean isRedFrame() {
            By errorFrameLocator = By.className("error");
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(errorFrameLocator));
                return true;
            } catch (TimeoutException err){
                return false;
            }
    }
}
