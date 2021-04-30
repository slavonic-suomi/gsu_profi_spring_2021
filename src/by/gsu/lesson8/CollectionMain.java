package by.gsu.lesson8;

import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();
        stringList.add("asd");
        stringList.add("qwe");
        stringList.add("zxc");
        stringList.add(1, "eee");
        System.out.println(stringList);

        Set<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(2);
        System.out.println(integers);


        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(1);
        integerQueue.add(3);
        integerQueue.add(5);

        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
    }
}
//         5
//    3        7
// 1     4
//
//
//
//
//
