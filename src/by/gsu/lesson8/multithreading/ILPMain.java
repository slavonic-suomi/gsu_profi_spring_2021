package by.gsu.lesson8.multithreading;

public class ILPMain {
    public static void main(String[] args) {

        int k1 = 1;
        int k2 = 1;
        int k3 = 1;
        int k4 = 1;

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000_000; i++) {
            k1 = k1 * k1;
            k2 = k2 * k2;
            k3 = k3 * k3;
            k4 = k4 * k4;
//            k1 = k1 * k1;
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
        System.out.println(k4);
    }
}
