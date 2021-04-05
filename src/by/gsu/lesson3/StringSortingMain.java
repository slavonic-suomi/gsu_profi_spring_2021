package by.gsu.lesson3;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

//UTF-16LE
public class StringSortingMain {
    public static void main(String[] args) {
        String[] arr = {"шишки", "ёжик", "ель"};

        Locale ru = Locale.forLanguageTag("ru");
        Collator collator = Collator.getInstance(ru);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j].compareTo(arr[j + 1]) > 0) {
                if (collator.compare(arr[j], arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
