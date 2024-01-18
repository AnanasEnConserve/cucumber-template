import general.BaseClass;
import org.junit.Test;

public class LoginTest extends BaseClass {

    @Test
    public void isLandingPageAvailable() throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(5000);
//        Assertions.assertEquals();
        System.out.println("Success");
    }
}
