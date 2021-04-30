package by.gsu.lesson8;

import by.gsu.lesson5.Job;

public class BoxMain {
    public static void main(String[] args) {
        SimpleBox sb1 = new SimpleBox();

        sb1.setValue("asd");
        String sb1Value = (String) sb1.getValue();


        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setValue("asdasd");
        String stringBoxValue = stringBox.getValue();

        String[] strings = { "asd", "qwe" };
//        Object[] objects = strings;

//        GenericBox<Object> objectBox = stringBox;
        GenericBox rawBox = stringBox;
        rawBox.setValue(new Job());

        String value = stringBox.getValue();
        System.out.println(rawBox.getValue());

    }
}
