package selenium7.pageObjects;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPageFactory {

    private WebDriver driver;

    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,5); // waiter используемый в PageFactory, суть: инициализирут элемент только в момент необходимости
        PageFactory.initElements(factory,this); // это строка инициализирует все веб-элементы
    }

    @FindBy(xpath = "//*[@type='email']")
    private WebElement emailField;

    @FindBy(css = "type = 'password'")
    private WebElement passwordField;

    @FindBy(tagName = "Button")
    private WebElement loginButton;

    @FindBy(className = "error")
    private WebElement errorFrame;

    public MainPage loginToApp(String username, String password){
        emailField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
        return new MainPage(driver);
    }

    public void open(String url){
        this.driver.get(url);
    }

    public boolean isErrorFrame(){
        try {
            return errorFrame.isDisplayed();
        } catch (TimeoutException err){
            return false;
        }
    }

}
