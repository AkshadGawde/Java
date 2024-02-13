package Exp_4;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result1 = calculator.add(10, 20);
        System.out.println("Result of adding two integers: " + result1);

        int result2 = calculator.add(30, 40, 50);
        System.out.println("Result of adding three integers: " + result2);
    }
}
