package selenium7two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage2 {

        private WebDriver driver;

        public LoginPage2(WebDriver driver) {
            this.driver = driver;
        }

        private WebElement getEmailField(){
            By emailFieldLocator = By.xpath("//*[@type='email']");
            return driver.findElement(emailFieldLocator);
        }

        private WebElement getPasswordField(){
            By passwordFieldLocator = By.cssSelector("[type=\"password\"]");
            return driver.findElement(passwordFieldLocator);
        }

        private WebElement getLogginButton(){
            return driver.findElement(By.tagName("button"));
        }

        public MainPage2 logginToKoel(String username, String password){
            getEmailField().sendKeys(username);
            getPasswordField().sendKeys(password);
            getLogginButton().click();
            return new MainPage2(driver);
        }

        public void navigate(String url){
            driver.get(url);
        }
}
