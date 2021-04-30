package by.gsu.lesson8;

public class GenericBox<Type> {

    private Type value;

    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        this.value = value;
    }
}
