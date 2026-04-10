
class Calculator {

    void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Addition: " + (a + b));
    }

    void add(double a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    void add(int a, double b) {
        System.out.println("Addition: " + (a + b));
    }

    void substract(int a, double b) {
        System.out.println("Substraction: " + (a - b));
    }

    void substract(int a, int b) {
        System.out.println("Substraction: " + (a - b));
    }

    void substract(double a, double b) {
        System.out.println("Substraction: " + (a - b));
    }

    void substract(double a, int b) {
        System.out.println("Substraction: " + (a - b));
    }

    void multiply(double a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    void multiply(int a, double b) {
        System.out.println("Multiplication: " + (a * b));
    }

    void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    void multiply(double a, double b) {
        System.out.println("Multiplication: " + (a * b));
    }

    void div(double a, double b) {
        System.out.println("Division: " + (a / b));
    }

    void div(double a, int b) {
        System.out.println("Division: " + (a / b));
    }

    void div(int a, double b) {
        System.out.println("Division: " + (a / b));
    }

    void div(int a, int b) {
        System.out.println("Division: " + (a / b));
    }
}

public class TestCalculator {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10.5,20.8);
        c.substract(10,20);
        c.multiply(10.5,2);
        c.div(10,2);
    }
}
