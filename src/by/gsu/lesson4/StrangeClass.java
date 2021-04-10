package by.gsu.lesson4;

public class StrangeClass {
    private int x;

    static {
        System.out.println("StrangeClass static init section");
    }

    {
        System.out.println("StrangeClass init section");
    }

    public StrangeClass() {
        System.out.println("StrangeClass constructor");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
