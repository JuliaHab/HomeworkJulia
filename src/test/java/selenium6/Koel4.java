package selenium6;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Koel4 {

    // Синхронизация (Synchronization)
    // wait используем тольо в той части где нам нужно дождаться загрузки страницы (при этом мы тормозим скрипт)

    private WebDriver driver;
    private WebDriverWait wait; // он основной!!! используется для синхронизации загруки кода и веб-страницы (устраняет недостатки implicitlyWait)
    private FluentWait<WebDriver> fluentWait; // второй способ синхронизации в java и selenium работает плохо, поэтому не используется

    @BeforeMethod
    public void startBeforeEveryTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10, 2000); // в переменных прописываем драйвер, максимальное ожидание в секундах, и повтор поиска в милисекундах
//      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /* этa строчка говорит о том что после того как страница загрузиться будет произведено дальнейшее действие сразу, поэтому Thread.sleep ранее использованные больше не нужны. Минус: заключется в том, что ждет поиск каждого
        элемента примерно 0,5 секунд и если таких элементов много, то это лишняя трата времени */
        fluentWait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(200)) // интервал поиска
                .withTimeout(Duration.ofSeconds(10)) // максималное время поиска
                .ignoring(org.openqa.selenium.NoSuchElementException.class) // игнорирование ошибки
                .ignoring(ElementClickInterceptedException.class) // игнорирование ошибки
                .ignoring(StaleElementReferenceException.class); // игнорирование ошибки
        driver.get("https://bbb.testpro.io");
    }

    @AfterMethod
    public void endAfterEveryTest() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void loginToKoel_incorrectLogin() throws InterruptedException {

        By emailFieldLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);
        emailField.sendKeys("Flower_cool@mail.ru");

        By passwordFieldLocator = By.cssSelector("[type=\"password\"]");
        WebElement passwordField = driver.findElement(passwordFieldLocator);
        passwordField.sendKeys("errorPassword");

        By loginButtonLocator = By.xpath("//*[@type=\"submit\"]");
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();

        By errorFrameLocator = By.className("error");
        fluentWait.until(x->x.findElement(errorFrameLocator).isDisplayed());
        WebElement errorFrame = driver.findElement(errorFrameLocator);
        Assert.assertTrue(errorFrame.isDisplayed());
    }

    @Test
    public void loginToKoel() {

        By emailFieldLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);
        emailField.sendKeys("Flower_cool@mail.ru");

        By passwordFieldLocator = By.cssSelector("[type=\"password\"]");
        WebElement passwordField = driver.findElement(passwordFieldLocator);
        passwordField.sendKeys("3103-juliana");

        By loginButtonLocator = By.xpath("//*[@type=\"submit\"]");
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();

        By homeIconLocator = By.className("home");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeIconLocator)); // ждет пока не произойдет ожидаемое событие, т.е. пока не появится элемент "home"
        WebElement homeIcon = driver.findElement(homeIconLocator);
        Assert.assertTrue(homeIcon.isDisplayed());
    }

    @Test
    public void createPlaylist () throws InterruptedException {

        By emailFieldLocator = By.xpath("//*[@type='email']");
        WebElement emailField = driver.findElement(emailFieldLocator);
        emailField.sendKeys("Flower_cool@mail.ru");

        By passwordFieldLocator = By.cssSelector("[type=\"password\"]");
        WebElement passwordField = driver.findElement(passwordFieldLocator);
        passwordField.sendKeys("3103-juliana");

        By loginButtonLocator = By.xpath("//*[@type=\"submit\"]");
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();

        By createPlaylist = By.xpath("//*[@class=\"fa fa-plus-circle create\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(createPlaylist));
        WebElement clickCreatePlaylist = driver.findElement(createPlaylist);
        clickCreatePlaylist.click();

        By newCreatePlaylist = By.xpath("//*[@class=\"menu playlist-menu\"]/ul/li[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(newCreatePlaylist));
        WebElement clickNewPlaylist = driver.findElement(newCreatePlaylist);
        clickNewPlaylist.click();

        By fieldNamePlaylist = By.xpath("//*[@class=\"create\"]/input");
        WebElement namePlaylist = driver.findElement(fieldNamePlaylist);
        namePlaylist.sendKeys("New Music");
        namePlaylist.sendKeys(Keys.ENTER);

        By myPlaylistLocator = By.xpath("//*[@class=\"playlist playlist\"]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(myPlaylistLocator)); // ждет пока не произойдет ожидаемое событие, т.е. пока не появится элемент "home"
        WebElement myPlaylist = driver.findElement(myPlaylistLocator);
        Assert.assertTrue(myPlaylist.isDisplayed());
    }
}
