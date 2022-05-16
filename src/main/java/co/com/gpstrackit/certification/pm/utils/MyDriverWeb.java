package co.com.gpstrackit.certification.pm.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyDriverWeb {
    private static WebDriver driver;
    public static MyDriverWeb web() {
        System.setProperty("webchromedriver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        return new MyDriverWeb();
    }
    public WebDriver inThePage(String url) {
        driver.get(url);
        return driver;
    }
}
