
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class FirstTest extends InitialSetup {

    @BeforeTest
    public void setupTest() {
        driver = new FirefoxDriver();
    }

    @Test
    public void pageLoad()  {

        HomePage homepage = new HomePage(driver);

        driver.get(baseUrl);
        homepage.initialPageLoad();

    }


}
