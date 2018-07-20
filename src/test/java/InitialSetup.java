import driverfactory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InitialSetup
{
    protected WebDriver driver;
    protected String baseUrl;
    protected String appVersion;

    @BeforeMethod
    //build driver from factory and set up base variables
    public void SetUp()
    {
        driver = new DriverFactory().create();
        baseUrl = "http://rentalcars.com/";
    }

    @AfterMethod
    public void TearDown()
    {
        driver.quit();
    }

}
