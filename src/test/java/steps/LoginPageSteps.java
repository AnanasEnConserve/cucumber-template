package steps;

import general.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageSteps extends BaseClass {

    @When("I log in as an existing user")
    public void iLogInAsAnExistingUser() {
        LoginPage loginPage = new LoginPage();
        loginPage.fillForm(testdata.get("play1.loginPage"));
    }

    @And("I move to the registration page")
    public void iMoveToRegistration() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickRegisterAsNewUser();
    }

}
