package by.gsu.lesson4;

public class Calculator {

    int sum(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b is 0, a ta ta");
        }
        return a + b;
    }

    int div(int a, int b) throws CalculationException{
        if (b == 0) {
            throw new CalculationException();
        }
        return a / b;
    }
}
