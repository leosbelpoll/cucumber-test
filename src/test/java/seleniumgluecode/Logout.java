package seleniumgluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class Logout {

    private ChromeDriver driver = Hooks.getDriver();

    @When("Selecciona el boton Salir")
    public void selecciona_el_boton_salir() {
        WebElement confirmarSalir = driver.findElementById("MPW0005MILOGIN");
        confirmarSalir.click();
    }
}
