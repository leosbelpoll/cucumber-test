package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    private ChromeDriver driver;

    @Given("^The browser shows the login page$")
    public void the_browser_shows_the_login_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();


    }

    @When("^The user enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void the_user_enters_username_as_and_password_as(String username, String password) throws Throwable {
        System.out.println("Type username and password");
    }

    @When("^The user press login button$")
    public void the_user_press_login_button() throws Throwable {
        System.out.println("Press login button");
    }

    @Then("^The app redirect to user home page$")
    public void the_app_redirect_to_user_home_page() throws Throwable {
        System.out.println("Redirect to user home");
    }

    @Then("^The app show an error$")
    public void the_app_show_an_error() throws Throwable {
        System.out.println("Show an error");
    }
}
