package calculator;

public class Calculator {
    public static int suma(int a, int b) {
        return a + b;
    }
    public static int resta(int a, int b) {
        return a - b;
    }
    public static int multiplicacion(int a, int b) {
        return a * b;
    }
    public static int division(int a, int b) {
        if (b != 0) {
            return (int) a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
}
