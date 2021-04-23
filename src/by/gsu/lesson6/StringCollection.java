package by.gsu.lesson6;

public interface StringCollection {
    int size();

    void add(String element);

    String get(int index);

    String[] toArray();

    void delete(int index);
}
