package com.company;

import java.util.Arrays;

public class Array2Main {
    public static void main(String[] args) {
        int[] array = { -1, -20, -3, -4, -7, -3 };

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
//        System.out.println(max);


//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length -1; j ++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }

        Arrays.sort(array);
        int[] copy = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            copy[i] = array[i];
//        }
        System.arraycopy(array, 0, copy, 0, array.length);

        copy[2] = 666;

        for (int i : array) {
            System.out.println(i);
        }

        System.out.println();
        for (int i : copy) {
            System.out.println(i);
        }

    }
}
