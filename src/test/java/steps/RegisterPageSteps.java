package steps;

import general.BaseClass;
import helpers.TestdataHelper;
import io.cucumber.java.en.When;
import pages.RegistrationPage;

public class RegisterPageSteps extends BaseClass {

    @When("I fill in my personal information")
    public void iFillInMyPersonalInformation() {
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.fillForm(TestdataHelper.readTestdata("play1.registrationPage"));
    }

}
