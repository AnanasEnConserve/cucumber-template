package pages;

import general.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass {

    @FindBy(xpath = "//input[@name='first_name']")
    WebElement firstNameInputField;

    @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastNameInputField;

    @FindBy(xpath = "//input[@name='email']")
    WebElement emailInputField;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordInputField;

    @FindBy(xpath = "//input[@name='confirm_password']")
    WebElement confirmPasswordInputField;

    @FindBy(xpath = "//input[@name='terms']")
    WebElement termsAndConditionsCheckbox;

    @FindBy(id = "submit_button")
    WebElement submitButton;

    public RegistrationPage() {
        initialize();
    }

    private void initialize() {
        PageFactory.initElements(driver, this);
    }


}
