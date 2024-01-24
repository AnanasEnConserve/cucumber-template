package runner.steps;

import general.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.LandingPage;

public class LandingPageSteps extends BaseClass {
    @Given("I move to the {string} page")
    public void iMoveToPage(String pageName) {
        LandingPage landingPage = new LandingPage();
        landingPage.moveToPage(pageName);
    }

    @Given("I move to the detail page")
    public void iMoveToTheDetailPage() throws InterruptedException {
        LandingPage landingPage = new LandingPage();
        landingPage.moveToPage();
        Thread.sleep(5000);
    }

    @Then("I should be back on the homepage")
    public void shouldBeOnHome() {
        Assertions.assertEquals("https://play1.automationcamp.ir/index.html", driver.getCurrentUrl(), "URL different than expected");
    }
}
