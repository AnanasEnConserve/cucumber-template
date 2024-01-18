package pages;

import general.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LandingPage extends BaseClass {


    //Create map of all buttons
    @FindBy(xpath = "//div[@class='card-header']/h5")
    List<WebElement> cardHeaders;

    @FindBy(xpath = "//div[@class='card-body']/a")
    List<WebElement> cardButtons;

    Map<String, WebElement> labelsAndCorrespondingButtons = new HashMap<>();

    public LandingPage() {
        initialize();
    }

    private void initializeMap() {
        for (int i = 0; i < cardHeaders.size(); i++) {
            labelsAndCorrespondingButtons.put(cardHeaders.get(i).getText().toLowerCase(), cardButtons.get(i));
        }
    }

    private void initialize() {
        PageFactory.initElements(driver, this);
    }

    public void moveToPage(String pageName) {
        element.waitAndClick(labelsAndCorrespondingButtons.get(pageName.toLowerCase()));
    }

}
