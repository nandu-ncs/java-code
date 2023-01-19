package SpringBoot;

public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public int addition() {
        return this.num1 + this.num2;
    }

    public int subtraction() {
        return this.num1 - this.num2;
    }

    public int multiplication() {
        return this.num1 * this.num2;
    }

    public int division() {
        return this.num1 / this.num2;
    }

    public int modulo() {
        return this.num1 % this.num2;
    }
}
