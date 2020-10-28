import com.leito.calc.Calc;

public class Main {
    public static void main(String[] args) {
        final long NUMERO1 = 10;
        final long NUMERO2 = 5;
        System.out.println(String.format("Para los numeros %s y %s", NUMERO1, NUMERO2));
        System.out.println("La suma es " + Calc.sumar(NUMERO1, NUMERO2));
        System.out.println("La resta es " + Calc.restar(NUMERO1, NUMERO2));
        System.out.println("La multiplicacion es " + Calc.multiplicar(NUMERO1, NUMERO2));
        System.out.println("La division es " + Calc.dividir(NUMERO1, NUMERO2));
    }
}
