package by.gsu.lesson2;

import java.util.Objects;

public class Transport {
    private static int transportCounter = 0;

    public static int getTransportCounter() {
        return transportCounter;
    }

    private String number;

    public Transport() {
        this("EMPTY");
        System.out.println("it's transport constructor");
    }

    public Transport(String number) {
        System.out.println("it's transport constructor with number " + number);
        this.number = number;

        transportCounter++;
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

    @Override
    public String toString() {
        return "Transport (number=" + number + ")";
    }



}
