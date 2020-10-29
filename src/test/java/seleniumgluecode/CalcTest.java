package seleniumgluecode;

import com.leito.calc.Calc;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalcTest {
    long result;

    @When("^Cuando el usuario suma (\\d+) y (\\d+)$")
    public void cuando_el_usuario_suma_y(long num1, long num2) throws Throwable {
        result = Calc.sumar(num1, num2);
    }

    @Then("^el resultado es (\\d+)$")
    public void el_resultado_es(long res) throws Throwable {
        assertEquals(result, res);
    }

    @When("^Cuando el usuario resta (\\d+) y (\\d+)$")
    public void cuando_el_usuario_resta_y(long num1, long num2) throws Throwable {
        result = Calc.restar(num1, num2);
    }

    @When("^Cuando el usuario multiplica (\\d+) y (\\d+)$")
    public void cuando_el_usuario_multiplica_y(long num1, long num2) throws Throwable {
        result = Calc.multiplicar(num1, num2);
    }

    @When("^Cuando el usuario divide (\\d+) y (\\d+)$")
    public void cuando_el_usuario_divide_y(long num1, long num2) throws Throwable {
        result = Calc.dividir(num1, num2);
    }

    @When("^Cuando el usuario divide por cero la funcion lanza una exception$")
    public void cuando_el_usuario_divide_por_cero() throws Throwable {
        try {
            Calc.dividir(5, 0);
            assertTrue(false);
        } catch (ArithmeticException e) {

        }
    }

}
