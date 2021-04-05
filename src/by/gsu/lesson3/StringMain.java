package by.gsu.lesson3;

public class StringMain {
    public static void main(String[] args) {
        String s1 = "asd";
        String s2 = new String("asd");

        int x1 = 1, x2 = 1;

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
//        System.out.println(x1 == x2);
    }
}
