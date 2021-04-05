package by.gsu.lesson1;

public abstract class Animal {
    protected String color;
    int age;
    int type;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void doVoice() {
        System.out.println("abstract animal nooooo");
    }

    public abstract void jump();

    int getWeight() {
        int result = 42;
        if (type != 0) {
            result = age / 10;
        }
        return result;
    }
}
