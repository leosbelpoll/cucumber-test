package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static ChromeDriver driver;

    @Before("@e2e")
    public void setup(){
        if (System.getProperty("os.name").toLowerCase().contains("windows")){
            System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver_wind.exe");
        }
        else {
            System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
        }
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @After("@e2e")
    public void cleanup(){
        driver.quit();
    }

    public static ChromeDriver getDriver() {
        return driver;
    }

}
