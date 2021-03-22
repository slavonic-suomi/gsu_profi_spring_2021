package by.gsu.lesson1;

public class Animal {
    String color;
    int age;
    int type;

    void song() {

    }

    int getWeight() {
        int result = 42;
        if (type != 0) {
            result = age / 10;
        }
        return result;
    }
}
