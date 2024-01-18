//package steps;
//
//import general.BaseClass;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.jupiter.api.Assertions;
//import pages.LandingPage;
//import pages.SignInPage;
//
//public class LoginTest extends BaseClass {
//
//    private SignInPage signInPage;
//
//    public LoginTest() {
//
//    }
//
//    @Given("I move to the sign in page")
//    public void iMoveToTheSignInPage() {
//        System.out.println("EXECUTING THE GIVEN");
//        LandingPage landingPage = new LandingPage();
//        landingPage.moveToSignIn();
//        //Evt. hier een assertion dat we ook daadwerkelijk aangekomen zijn op de sign in page
//    }
//
//    @When("I enter an invalid {string} and {string} combination")
//    public void iEnterInvalidCredentials(String email, String password) {
//        signInPage = new SignInPage();
//        signInPage.login(email, password);
//    }
//
//    @Then("I should be denied access")
//    public void iShouldBeDeniedAccess() {
//        Assertions.assertEquals("Your password is incorrect", signInPage.getAlertMessage(), "alert message was different than expected");
//    }
//
//}
