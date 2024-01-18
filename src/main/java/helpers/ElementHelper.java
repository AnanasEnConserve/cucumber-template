package helpers;


import general.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ElementHelper extends BaseClass {

    public void hoverOverElement(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element);
    }

    public void waitAndClick(WebElement element) {
        //TODO Add wait for network traffic && page loaded
        wait.waitForReadyElement(element);
        jsExecutor.executeScript("arguments[0].click;", element);
    }

    public void waitAndSendKeys(WebElement element, String keysToEnter) {
        wait.waitForReadyElement(element);
        element.sendKeys(keysToEnter);
    }
}
