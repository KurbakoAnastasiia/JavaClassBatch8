package Class27and28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/agameganon/Documents/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com");
        System.setProperty("webdriver.firefox.driver","/Users/agameganon/Documents/chromedriver.exe");
        WebDriver fireFox = new FirefoxDriver();
        chromeDriver.get("https://www.google.com");

    }
}
