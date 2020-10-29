package seleniumgluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Login {

    private ChromeDriver driver = Hooks.getDriver();

    @When("Verificar que el sistema muestra la pantalla de login")
    public void verificar_que_el_sistema_muestra_la_pantalla_de_login() {
        WebElement form = driver.findElementById("MAINFORM");
        assertTrue(form.isDisplayed());
    }

    @When("Ingresar usuario {string}")
    public void ingresar_usuario_en_el_campo_usuario(String usuario) {
        WebElement usuarioInput = driver.findElementById("vUSER");
        usuarioInput.sendKeys(usuario);
    }

    @When("Ingresar contrasenna {string}")
    public void ingresar_contrasenna_en_el_campo_contrasenna(String contrasenna) {
        WebElement contrasennaInput = driver.findElementById("vPASSWORD");
        contrasennaInput.sendKeys(contrasenna);
    }

    @When("Hacer clic en el boton Confirmar")
    public void hacer_clic_en_el_boton_confirmar() {
        WebElement confirmarButton = driver.findElementById("BUTTON1");
        confirmarButton.click();

    }
    @Then("El usuario ingresa de forma correcta al sistema")
    public void el_usuario_ingresa_de_forma_correcta_al_sistema() {
        WebDriverWait wait = new WebDriverWait(driver, 2);
        WebElement titulosistema = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("MPW0005GEOPRESCRIPTIONS")));
        assertTrue(titulosistema.isDisplayed());
    }

    @Then("El sistema muestra mensaje de error")
    public void el_sistema_muestra_mensaje_de_error() {
        WebDriverWait wait = new WebDriverWait(driver, 2);
        WebElement errorLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"toast-container\"]/div[1]/div")));
        assertTrue(errorLogin.isDisplayed());
        String msjErrorLogin = "El usuario o la contraseña no es correcta.";
        assertEquals(msjErrorLogin, errorLogin.getText());
    }

    @Given("El usuario esta autenticado en el sistema SIM")
    public void el_usuario_esta_autenticado_en_el_sistema_sim() {
        WebElement usuarioInput = driver.findElementById("vUSER");
        usuarioInput.sendKeys("admin");
        WebElement contrasennaInput = driver.findElementById("vPASSWORD");
        contrasennaInput.sendKeys("admin123");
        WebElement confirmarButton = driver.findElementById("BUTTON1");
        confirmarButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 2);
        WebElement titulosistema = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("MPW0005GEOPRESCRIPTIONS")));
        assertTrue(titulosistema.isDisplayed());
    }
}
