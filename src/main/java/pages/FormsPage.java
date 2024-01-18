package pages;

import general.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage extends BaseClass {

    @FindBy(id = "validationCustom03")
    WebElement cityInputField;

    @FindBy(id = "validationCustom04")
    WebElement stateInputField;

    @FindBy(id = "validationCustom05")
    WebElement zipcodeInputField;

    @FindBy(id = "invalidCheck")
    WebElement checkbox;

    @FindBy(xpath = "//button")
    WebElement continueButton;

    public FormsPage() {
        initialize();
    }

    private void initialize() {
        PageFactory.initElements(driver, this);
    }

    public void fillForm(String city, String state, String zipcode) {
        wait.waitForVisibleElement(cityInputField);
        element.waitAndSendKeys(cityInputField, city);
        element.waitAndSendKeys(stateInputField, state);
        element.waitAndSendKeys(zipcodeInputField, zipcode);
    }

    public void submitForm() {
        element.waitAndClick(checkbox);
        element.waitAndClick(continueButton);
    }




}
