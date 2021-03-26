package by.gsu.lesson1;

public class DogCloningLab {
    public static void main(String[] args) {
        Dog originalDog = new Dog();
        originalDog.age = 13;
        originalDog.setColor("BLACK");
        originalDog.setHuntedCats(5);

        Dog clonedDog = originalDog.cloneDog();
        System.out.println(clonedDog.age);
        System.out.println(clonedDog.getColor());
        System.out.println(clonedDog.getHuntedCats());
    }
}
