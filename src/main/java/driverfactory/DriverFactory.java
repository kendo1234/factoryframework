package driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory
{
    public WebDriver create() //Initial creation
    {
        try{
            if(System.getenv("browser").equals("firefox")){
                return generateFirefoxDriver();
            } else {
                return generateChromeDriver();
            }
        } catch (NullPointerException e){
            return generateChromeDriver();
        }
    }

    //Retrieve drivers from project files
    private ChromeDriver generateChromeDriver(){
        String pathToChromeDriver = "";
        if(System.getProperty("os.name").contains("Mac")) {
            pathToChromeDriver = System.getProperty("user.dir") + "/src/main/java/driverfactory/chromedriverMac";
        } else if(System.getProperty("os.name").contains("Linux")) {
            pathToChromeDriver = System.getProperty("user.dir") + "/src/main/java/driverfactory/chromedriverLinux";
        } else if (System.getProperty("os.name").contains("Windows")) {
            pathToChromeDriver = System.getProperty("user.dir") + "/src/main/java/driverfactory/chromedriverWindows.exe";
        }
        else {
            throw new RuntimeException("Could not detect Operating System");
        }
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        return new ChromeDriver();
    }

    private FirefoxDriver generateFirefoxDriver(){
        String pathToFirefoxDriver = "";
        if(System.getProperty("os.name").contains("Mac")) {
            pathToFirefoxDriver = System.getProperty("user.dir") + "/src/main/java/driverfactory/geckodriverMac";
        } else if(System.getProperty("os.name").contains("Linux")) {
            pathToFirefoxDriver = System.getProperty("user.dir") + "/src/main/java/driverfactory/geckodriverLinux";
        } else if (System.getProperty("os.name").contains("Windows")) {
            pathToFirefoxDriver = System.getProperty("user.dir") + "/src/main/java/driverfactory/geckodriverWindows.exe";
        }
        else {
            throw new RuntimeException("Could not detect Operating System");
        }
        System.setProperty("webdriver.gecko.driver", pathToFirefoxDriver);
        return new FirefoxDriver();
    }
}

