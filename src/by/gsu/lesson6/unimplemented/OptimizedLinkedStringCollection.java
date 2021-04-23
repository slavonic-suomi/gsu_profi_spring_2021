package by.gsu.lesson6.unimplemented;

import by.gsu.lesson6.StringCollection;

public class OptimizedLinkedStringCollection implements StringCollection {

    private static class Node {
        String value;
        Node next;
    }

    private Node head;
    private int counter = 0;

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void add(String element) {
        Node newNode = new Node();
        newNode.value = element;
        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        counter++;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public String[] toArray() {
        return new String[0];
    }

    @Override
    public void delete(int index) {

    }
}
