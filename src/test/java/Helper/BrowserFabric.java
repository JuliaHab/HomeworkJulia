package Helper;

import enums.BrowserTypes;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserFabric {

    public static WebDriver getDriver(BrowserTypes type){
        switch (type){
            case OPERA: return getOperaDtiver();
            case EDGE: return getEdgeDtiver();
            case FIREFOX: return getFirefoxDtiver();
            default: return getChromeDtiver();
        }
    }

    private static WebDriver getChromeDtiver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("window-size=1400,1000");
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(options);
    }

    private static WebDriver getFirefoxDtiver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--width=1400");
        options.addArguments("--height=1000");
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver(options);
    }

    private static WebDriver getEdgeDtiver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

    private static WebDriver getOperaDtiver() {
        WebDriverManager.operadriver().setup();
        return new OperaDriver();
    }
}
