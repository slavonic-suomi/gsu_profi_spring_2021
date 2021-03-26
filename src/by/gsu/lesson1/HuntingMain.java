package by.gsu.lesson1;

public class HuntingMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        int hunting1 = 5;
        int hunting2 = 10;
        cat.hunt(hunting1);
        cat.hunt(hunting2);

        System.out.println(cat.getHuntedMice());

        Cat anotherCat = new Cat();
        cat.sendGift(anotherCat);

        System.out.println(anotherCat.getHuntedMice());
        cat.sendGift();

    }
}
