package by.gsu.lesson1;

public class Dog extends Animal {
    int huntedCats;

    void song() {
        System.out.println("wow");
    }

    Dog cloneDog() {
        Dog clone = new Dog();
        clone.age = this.age;
//        clone.color = color;
//        clone.huntedCats = huntedCats;
        return clone;
    }
}
