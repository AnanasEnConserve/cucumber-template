package runner.steps;

import general.BaseClass;
import helpers.TestdataHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.RegistrationPage;

public class RegisterPageSteps extends BaseClass {

    @When("I fill in my personal information")
    public void iFillInMyPersonalInformation() {
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.fillForm(TestdataHelper.readTestdata("play1.registrationPage"));
    }

    @Then("I should be registered successfully")
    public void registrationShouldBeSuccessful() {
        RegistrationPage registrationPage = new RegistrationPage();
        Assertions.assertTrue(registrationPage.checkForSuccessMessage(), "Did not find success message");
    }

}
