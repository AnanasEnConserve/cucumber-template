package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Driver {

    public static WebDriver setDriver() {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments()
        return new ChromeDriver();
    }

}
