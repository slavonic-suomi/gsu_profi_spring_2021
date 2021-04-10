package by.gsu.lesson3;

import java.util.Arrays;

public class StringExampleMain {
    public static void main(String[] args) {
        int i = 1;
        System.out.println( "asd".length() );
        System.out.println( "asd".toUpperCase() );
        System.out.println(Arrays.toString("asd".getBytes() ));

        System.out.println("12345".substring(2, 5));

        System.out.println("   234 543 324    ".trim());

        System.out.println( "asd123ertasd".replaceAll("asd", "232") );

        System.out.println( "asd123ertasd".replaceAll("[0-9]", "") );
        System.out.println( "asd123ertaSDd".replaceAll("[a-zA-Z]", "") );
        System.out.println( "asd123ertaSDd".replaceAll("[a-zA-Z]{4}", "") );


    }
}
