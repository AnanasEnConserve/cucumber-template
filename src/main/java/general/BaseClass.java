package general;

import helpers.Driver;
import helpers.ElementHelper;
import helpers.WaitHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BaseClass {

    protected static WebDriver driver;
    protected static ElementHelper element;
    protected static WaitHelper wait;
    protected static JavascriptExecutor jsExecutor;
    /*
    Initialize driver
    Before & After methods (setup & teardown)
    Generate Report + Screenshots
     */

    public void setupFromBaseClass() {
        System.out.println("base class setup");
        element = new ElementHelper();
        wait = new WaitHelper();
        driver = Driver.setDriver();
        jsExecutor = (JavascriptExecutor) driver;
        driver.get("https://www.amazon.com/");
    }

    public void teardownFromBaseClass() {
        System.out.println("Base class teardown");
        driver.quit();
    }

}
