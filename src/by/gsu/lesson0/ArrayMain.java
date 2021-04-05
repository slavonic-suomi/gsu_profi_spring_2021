package by.gsu.lesson0;

import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {
        int[] intArray = new int[5];

        intArray[0] = 13;
        intArray[1] = 26;

//        System.out.println(Arrays.toString(intArray));

        int pointer = 0;
        while (pointer < intArray.length) {
            System.out.println(intArray[pointer++]);
        }
        int pointer2 = 0;
        while (true) {
            System.out.println(intArray[pointer2++]);
            if (pointer2 >= intArray.length) {
                break;
            }
//            System.out.printf("hello!");
        }

        int x = 5, pointer3 = 0;
        while (true) {
            pointer3++;
            System.out.println("iteration start " + pointer3 );
            //....

            if (pointer3 % 2 == 0) {
                continue;
            }

            if (pointer3 >= x) {
                break;
            }
            System.out.println("iteration end " + pointer3 );
        }

//        do {
//
//        } while (true);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        for (int i: intArray) {
            System.out.println(i);
        }

    }
}
