package Class27;

public class WebDriverTest {
    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
        webDriver.openBrowser();
        webDriver.closeBrowser();
        webDriver.maximizeBrowser();
        webDriver.findElement();
        WebDriver webDriver1 = new FireFoxDriver();
        webDriver1.openBrowser();
        webDriver1.closeBrowser();
        webDriver1.maximizeBrowser();
        webDriver1.findElement();
    }
}
