package by.gsu.lesson2;

import java.util.Objects;

public class Transport {
    private String number;

    @Override
    public boolean equals(Object another) {
        if (this == another) {
            return true;
        }
        if (another instanceof Transport) {
            Transport anotherTransport = (Transport) another;
            if (this.number.equals(anotherTransport.number)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

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
