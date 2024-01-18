package helpers;

import constants.Timeouts;
import org.awaitility.Awaitility;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class WaitHelper {
    public void waitForVisibleElement(WebElement element) {
        Awaitility.await().atMost(Timeouts.TIMEOUT_DEFAULT, TimeUnit.SECONDS)
                .ignoreException(StaleElementReferenceException.class)
                .until(element::isDisplayed);
    }

    public void waitForEnabledElement(WebElement element) {
        Awaitility.await().atMost(Timeouts.TIMEOUT_DEFAULT, TimeUnit.SECONDS)
                .ignoreException(StaleElementReferenceException.class)
                .until(element::isEnabled);
    }

    public void waitForReadyElement(WebElement element) {
        Awaitility.await().atMost(Timeouts.TIMEOUT_DEFAULT, TimeUnit.SECONDS)
                .ignoreException(StaleElementReferenceException.class)
                .until(() -> element.isEnabled() && element.isDisplayed());
    }
}
