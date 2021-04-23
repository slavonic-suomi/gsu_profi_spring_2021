package by.gsu.lesson4;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        try {
            calc.sum(1, 0);

            int result = calc.div(1, 0);
            System.out.println("division: " + result);
        } catch (Throwable e) {
            System.out.println("there was an exception!");
        } finally {
            System.out.println("finally!");
        }
        System.out.println("it's ok, we are here");
    }
}
