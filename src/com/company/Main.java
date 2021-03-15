package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int a = 19;
        int b = 100;

        int x = new Scanner(System.in).nextInt();
        System.out.println(x);
        double result;

        if (x < a) {
            result = Math.sin(x);
        } else if (x >= a && x <= b) {
            result = Math.sqrt(x);
        } else {
            result = Math.pow(x, 3);
        }

        System.out.println(result);

    }
}
