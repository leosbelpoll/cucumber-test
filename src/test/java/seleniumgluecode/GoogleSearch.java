package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GoogleSearch {

    private ChromeDriver driver = Hooks.getDriver();

    @Given("^The browser shows the google page$")
    public void the_browser_shows_the_google_page() throws Throwable {
        String pageTitle = "Google";
        assertEquals(pageTitle, driver.getTitle());
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

}
