package pages;

import general.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BaseClass {

    @FindBy(id = "ap_email")
    WebElement emailInputField;

    @FindBy(id = "continue")
    WebElement continueButton;

    @FindBy(id = "ap_password")
    WebElement passwordInputField;

    @FindBy(className = "a-alert-content")
    WebElement alertMessage;


    public SignInPage() {
        initialize();
    }

    private void initialize() {
        PageFactory.initElements(driver, this);
    }

    public void login(String email, String password) {
        enterEmail(email);
        clickContinue();
        initialize();
        enterPassword(password);
        clickContinue();
    }

    private void enterEmail(String email) {
        element.waitAndSendKeys(emailInputField, email);
    }

    private void clickContinue() {
        element.waitAndClick(continueButton);
    }

    private void enterPassword(String password) {
        element.waitAndSendKeys(passwordInputField, password);
    }

    public String getAlertMessage() {
        wait.waitForVisibleElement(alertMessage);
        return alertMessage.getText();
    }
}
