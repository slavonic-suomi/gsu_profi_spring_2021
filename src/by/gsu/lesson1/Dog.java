package by.gsu.lesson1;

public class Dog extends Animal {
    private int huntedCats;

    public int getHuntedCats() {
        return huntedCats;
    }

    @Override
    public void jump() {
        System.out.println("hooray!");
    }

    public void setHuntedCats(int cats) {
        huntedCats = cats;
    }

    void doVoice() {
        System.out.println("wow");
    }

    Dog cloneDog() {
        Dog clone = new Dog();
        clone.age = this.age;
//        clone.setColor(color);
        clone.color = color;
        clone.huntedCats = huntedCats;
        return clone;
    }
}
