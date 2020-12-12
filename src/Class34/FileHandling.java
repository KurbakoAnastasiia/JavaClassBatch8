package Class34;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class FileHandling {




    public static void main(String[] args) throws IOException {

        // Storing the path of the file in a String variable
        String path = "/Users/agameganon/eclipse-workspace/JavaClassBatch8/src/Class34/Credentials.properties";
        String path1 = "/Users/agameganon/eclipse-workspace/JavaClassBatch8/src/Class34/Credentials2.properties";
        // Creating a connection to file
        FileInputStream fileInputStream=new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(path1);
        Properties properties = new Properties();

        // Loading the data from file to java program
        properties.load(fileInputStream);

        // getting the values
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String number = properties.getProperty("phoneNumber");
        System.out.println(number);

        // storing the data to file
        properties.setProperty("phoneNumber", "11111111");
        properties.store(fileOutputStream, "Changing the number");

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
    }
}
