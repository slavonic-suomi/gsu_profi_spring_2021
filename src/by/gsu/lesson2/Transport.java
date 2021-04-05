package by.gsu.lesson2;

public class Transport {
    private String number;

    public Transport() {
        this("EMPTY");
        System.out.println("it's transport constructor");
    }

    public Transport(String number) {
        System.out.println("it's transport constructor with number " + number);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("deleting transport!");
    }
}
