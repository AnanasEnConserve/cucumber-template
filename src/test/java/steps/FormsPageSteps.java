package steps;

import general.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.FormsPage;

public class FormsPageSteps extends BaseClass {

    FormsPage formsPage;

    //"city" "state" and "zipcode"
//    {string} {string} and {string}
    @When("Correctly filling in {string} {string} and {string}")
    public void correctlyFillingInTheForm(String city, String state, String zipcode) {
        formsPage = new FormsPage();
        formsPage.fillForm(city, state, zipcode);
    }

    @When("Incorrectly filling in {string} {string} and {string}")
    public void incorrectlyFillingInTheForm(String city, String state, String zipcode) {
        formsPage = new FormsPage();
        formsPage.fillFormIncorrectly(city, state, zipcode);
    }

    @Then("The form should submit")
    public void theFormShouldSubmit() {
        formsPage.submitForm();
        Assertions.assertEquals(0, formsPage.getAmountOfErrors(), "Found an unexpected error message");
    }
}
