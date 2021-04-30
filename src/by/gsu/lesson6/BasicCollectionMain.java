package by.gsu.lesson6;

import by.gsu.lesson6.unimplemented.DualLinkedStringCollection;

public class BasicCollectionMain {
    public static void main(String[] args) {
        StringCollection strings = new DualLinkedStringCollection();
        strings.add("asd1");
        strings.add("asd2");
        strings.add("asd3");
        strings.add("asd4");
        strings.add("asd5");
        strings.add("asd6");
        strings.add("asd7");

        System.out.println(strings.size());

//        strings.delete(1);
//        System.out.println(Arrays.toString( strings.toArray() ));

    }
}
