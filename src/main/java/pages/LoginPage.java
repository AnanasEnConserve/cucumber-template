package pages;

import general.BaseClass;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.JsonNode;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    @FindBy(id = "user")
    WebElement userInputField;

    @FindBy(id = "password")
    WebElement passwordInputField;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement checkbox;

    @FindBy(id = "login")
    WebElement loginButton;

    @FindBy(partialLinkText = "Register")
    WebElement registerLink;

    public LoginPage() {
        initialize();
    }

    private void initialize() {
        PageFactory.initElements(driver, this);
    }

    public void fillForm(JsonNode testdata) {
        element.waitAndSendKeys(userInputField, testdata.get("username").asText());
        element.waitAndSendKeys(passwordInputField, testdata.get("password").asText());
        if (testdata.get("rememberMe").asBoolean()) {
            element.waitAndClick(checkbox);
        }
        element.waitAndClick(loginButton);
    }


}
