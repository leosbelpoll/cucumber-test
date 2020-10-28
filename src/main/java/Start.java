import com.leito.calc.Calc;

public class Start {
    public static void main(String[] args) {
        System.out.println("Start the calc");
        System.out.println("The sum is " + Calc.sumar(34, 2));
        System.out.println("The rest is " + Calc.restar(34, 2));
        System.out.println("The division is " + Calc.dividir(34, 2));
        System.out.println("The multiplication is " + Calc.multiplicar(34, 2));
    }
}
