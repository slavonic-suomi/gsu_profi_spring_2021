package by.gsu.lesson6;

/// 0010_1001
/// 0001_0100


// ##
// ####
// ########
// ##############################
// ################################
public class ArrayStringCollection implements StringCollection {

    private String[] storage = new String[5];
    private int counter = 0;

    @Override
    public void add(String element) {
        if (counter >= storage.length) {
            String[] newStorage = new String[counter + (counter >> 1)];
            System.arraycopy(storage, 0, newStorage, 0, storage.length);
            newStorage[counter++] = element;
            storage = newStorage;
        } else {
            storage[counter++] = element;
        }
    }

    @Override
    public String get(int index) {
        checkIndex(index);
        return storage[index];
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public String[] toArray() {
        String[] copy = new String[counter];
        System.arraycopy(storage, 0, copy, 0, counter);
        return copy;
    }

    @Override
    public void delete(int index) {
        checkIndex(index);
//        for (int i = index; i < counter - 1; i++) {
//            storage[i] = storage[i + 1];
//        }
        System.arraycopy(storage, index + 1, storage, index, counter - index - 1);
        counter--;
    }

    private void checkIndex(int index) {
        if (index >= counter || index < 0) {
            throw new IllegalArgumentException("wrong index");
        }
    }
}
