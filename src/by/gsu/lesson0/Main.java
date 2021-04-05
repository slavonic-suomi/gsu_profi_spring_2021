package by.gsu.lesson0;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        double a = 19;
        double b = 100;
        double u = 13;

        int x = new Scanner(System.in).nextInt();
        System.out.println(x);
        double result;
        if (x < a) {
            result = Math.log(x + u / (5 * x));
        } else if (x >= a && x <= b) {
            result = Math.pow(3, -4);
        } else  {
            result = Math.tan(Math.PI * (x + u));
        }
        System.out.println(result);

    }
}
