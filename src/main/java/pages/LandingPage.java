package pages;

import general.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BaseClass {

    @FindBy(id = "nav-link-accountList")
    WebElement accountListButton;

    @FindBy(id = "nav-flyout-ya-signin")
    WebElement signInButton;

    public LandingPage() {
        initialize();
    }

    public void moveToSignIn() {
        element.hoverOverElement(accountListButton);
        element.waitAndClick(signInButton);
    }

    private void initialize() {
        PageFactory.initElements(driver, this);
    }

}
