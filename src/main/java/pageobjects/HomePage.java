package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageObject {

    private static final By HOME_PAGE_TEXT = By.cssSelector(".heading");

    public HomePage(WebDriver driver) {
        super(driver);

    }

    public void initialPageLoad() {
        driver.findElement(HOME_PAGE_TEXT);
    }
}
