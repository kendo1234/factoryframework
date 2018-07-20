package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageObject {

    private static final By FTS_FIELD = By.id("");

    public HomePage(WebDriver driver) {
        super(driver);

    }

    public void initialPageLoad() {
        driver.findElement(FTS_FIELD).click();
    }
}
