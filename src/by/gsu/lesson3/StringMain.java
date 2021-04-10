package by.gsu.lesson3;

public class StringMain {
    public static void main(String[] args) {
        String s1 = "asd";
        String s2 = new String("asd");

        int x1 = 1, x2 = 1;

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
//        System.out.println(x1 == x2);

        String s3 = "a" + "b" + "c";

//        String result = "";
//        for (int i = 0; i < 10; i++) {
//            result +=  i;
//        }
//        System.out.println(result);

        StringBuilder sb = new StringBuilder("___");
        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }
        sb.delete(0, 3);

        System.out.println(sb.toString());

    }
}
