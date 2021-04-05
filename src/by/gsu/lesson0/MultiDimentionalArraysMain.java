package by.gsu.lesson0;

public class MultiDimentionalArraysMain {
    public static void main(String[] args) {
        int [][] array = new int[3][2];
        array[0][0] = 1;

        for (int[] ints : array) {
            System.out.println();
            for (int i : ints) {
                System.out.println(" " + i);
            }
        }
        int [][] array2 = { {1, 2}, {3, 4} };

//        int[][] strangeArray = new int[3][];
//        strangeArray[0] = new int[5];
//        strangeArray[1] = new int[7];
//        strangeArray[2] = new int[2];


    }
}
