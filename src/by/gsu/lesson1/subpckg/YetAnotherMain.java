package by.gsu.lesson1.subpckg;

import by.gsu.lesson1.Animal;
import by.gsu.lesson1.Cat;
import by.gsu.lesson1.Dog;

public class YetAnotherMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.hunt(12);
//        cat.setColor("blue");
        if (cat.getColor() != null) {
            System.out.println(cat.getColor().toUpperCase());
        }

        Animal dog = new Dog();

        dog.jump();
        cat.jump();

    }
}
