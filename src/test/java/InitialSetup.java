import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InitialSetup {
    WebDriver driver;
    String baseUrl;

    @BeforeMethod
    //build driver from factory and set up base variables
    public void SetUp() {
        WebDriverManager.firefoxdriver().setup();
        baseUrl = "https://the-internet.herokuapp.com/";
    }

    @AfterMethod
    public void TearDown() {
        if (driver != null) {
            driver.quit();
        }

    }
}