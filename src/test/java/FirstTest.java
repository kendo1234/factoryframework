import org.testng.annotations.Test;
import pageobjects.HomePage;

public class FirstTest extends InitialSetup {
    @Test
    public void pageLoad()  {

        HomePage homepage = new HomePage(driver);

        driver.get(baseUrl);
        homepage.initialPageLoad();

    }


}
