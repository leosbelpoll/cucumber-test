package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class GoogleSearch {

    private ChromeDriver driver;

    @Given("^The browser shows the google page$")
    public void the_browser_shows_the_google_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @When("^The user enters \"([^\"]*)\" into google search bar$")
    public void the_user_enters_into_google_search_bar(String searchTopic) throws Throwable {
        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys(searchTopic);
    }

    @When("^The user press enter key$")
    public void the_user_press_search_button() throws Throwable {
        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys(Keys.RETURN);
    }

    @Then("^The app show several results$")
    public void the_app_show_several_results() throws Throwable {
        WebElement results = driver.findElement(By.className("g"));
        assertTrue("There are not results", results.isDisplayed());
    }

    @After
    public void cleanup() {
        driver.quit();
    }
}
