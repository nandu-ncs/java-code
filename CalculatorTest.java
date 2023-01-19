public class CalculatorTest {
    public CalculatorTest() {
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator(5, 10);
        System.out.println(calculator.addition());
        System.out.println(calculator.subtraction());
    }
}
