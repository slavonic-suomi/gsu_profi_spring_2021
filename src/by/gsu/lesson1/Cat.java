package by.gsu.lesson1;

public class Cat extends Animal {
    private int huntedMice;

    public int getHuntedMice() {
        return huntedMice;
    }

    @Override
    public void jump() {
        System.out.println("no");
    }

    @Override
    void doVoice() {
        super.doVoice();
        System.out.println("meow");
    }

    public void hunt(int mice) {
        if (mice < 0) {
            System.out.println("wrong number");
        } else {
            huntedMice += mice;
        }
    }

    void sendGift(Cat anotherCat) {
//        anotherCat = new Cat();
        huntedMice--;
        anotherCat.huntedMice++;
    }

    void sendGift(Dog dog) {

    }

    int sendGift() {
        return 1;
    }
}
