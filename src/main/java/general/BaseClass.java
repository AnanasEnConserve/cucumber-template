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
        element = new ElementHelper();
        wait = new WaitHelper();
        driver = Driver.setDriver();
        jsExecutor = (JavascriptExecutor) driver;
        driver.get("https://play1.automationcamp.ir/");
    }

    public void teardownFromBaseClass() {
        driver.quit();
    }

}
