import com.leito.calc.Calc;

public class Start {
    public static void main(String[] args) {
        System.out.println("Start the calc");
        System.out.println("The sum is " + Calc.sum(34, 2));
        System.out.println("The rest is " + Calc.rest(34, 2));
        System.out.println("The division is " + Calc.divide(34, 2));
        System.out.println("The multiplication is " + Calc.multiply(34, 2));
    }
}
