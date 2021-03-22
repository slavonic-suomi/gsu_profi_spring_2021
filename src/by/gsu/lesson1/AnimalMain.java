package by.gsu.lesson1;

public class AnimalMain {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal();

        Animal[] array = new Animal[3];
        array[0] = a1;
        array[1] = a2;
        array[2] = a3;

        a1.age = 100;
        a1.color = "RED";

        System.out.println(a1.age);
        System.out.println(a1.color);

//        int x;
//        System.out.println(x);

        System.out.println(a2.age);
        System.out.println(a2.color);

        Dog dog1 = new Dog();
        dog1.age = 12;
        dog1.color = "GREY";
        dog1.huntedCats = 1;

        dog1.song();
        dog1.song();
        dog1.song();
        dog1.song();

//        a1.huntedCats
        Cat cat1 = new Cat();
        cat1.huntedMice = 222;
        cat1.age = 23;

//        cat1.song();

        Animal a4 = new Cat();
        a4.song();
        int a4Weight = a4.getWeight();
        System.out.println(a4Weight);

    }
}
