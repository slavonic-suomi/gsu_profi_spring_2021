package by.gsu.lesson7;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        sc.nextLine(); //fix 'newline' symbol in buffer
        System.out.println(i1);

        String s = sc.nextLine();
        System.out.println(s);

        int i2 = sc.nextInt();
        System.out.println(i2);

    }
}
