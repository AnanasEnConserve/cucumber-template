package general;

import helpers.*;
import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.JsonNode;
import io.cucumber.java.Scenario;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BaseClass {

    protected static WebDriver driver;
    protected static ElementHelper element;
    protected static WaitHelper wait;
    protected static JavascriptExecutor jsExecutor;

    protected static JsonNode testdata;
    protected static String testcaseNumber;
    /*
    Initialize driver
    Before & After methods (setup & teardown)
    Generate Report + Screenshots
     */

    public void setupFromBaseClass(Scenario scenario) {
        element = new ElementHelper();
        wait = new WaitHelper();
        driver = Driver.setDriver();
        jsExecutor = (JavascriptExecutor) driver;
        //set testdata
        if (scenario.getName().contains("[TC")) {
            try {
                testdata = TestdataHelper.loadTestdata(scenario.getName());
            } catch (JsonProcessingException e) {
                System.out.println(e.getMessage());
            }
        }

        driver.get("https://play1.automationcamp.ir/");
    }

    public void teardownFromBaseClass(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot and append to report
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed test \"" + scenario.getName() + "\" at " + TimestanpHelper.now());
        }
        driver.quit();
    }

}
