package steps;

import general.BaseClass;
import io.cucumber.java.en.Given;
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

}
