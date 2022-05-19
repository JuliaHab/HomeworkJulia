package selenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class Koel3 {

    private WebDriver driver;

    @BeforeMethod
    public void startBeforeEveryTest(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://bbb.testpro.io");
    }

    @AfterMethod
    public void endAfterEveryTest() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void properties(){

        // свойства driver

        String url = driver.getCurrentUrl(); // вытаскивает url
        System.out.println(url);

        String title = driver.getTitle(); // вытаскивает название титула
        System.out.println(title);

        List<WebElement> dive = driver.findElements(By.tagName("div")); // вытаскивает количство элементов с названием "div"
        System.out.println(dive.size());

        List<WebElement> tds = driver.findElements(By.tagName("td")); // ищет элементы и выдает результат (даже если элементов нет)
        WebElement td = driver.findElement(By.tagName("td")); // если еслемент не найден выдает ошибку

        // quit, close - оба закрывают, но close закрывает страницу, а quit полностью браузер (сейчас close не используется)

        driver.navigate().refresh(); // обноволение страницы

        // свойства WebElement

        WebElement div0 = dive.get(0);
        System.out.println(div0.getTagName()); // вытаскивает тэг элемента

        System.out.println(div0.isDisplayed()); // мщет отображается ли элемент на экране браузера
        System.out.println(div0.isEnabled()); // указывает, включено ли правило

        // getAttribute помогает найти атрибут внутри элемента
    }
}

