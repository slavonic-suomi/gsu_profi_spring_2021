package by.gsu.lesson6.unimplemented;

import by.gsu.lesson6.StringCollection;

public class DualLinkedStringCollection implements StringCollection {

    private static class Node {
        String value;
        Node next;
        Node prev;
    }

    private Node head;
    private Node tail;
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
            tail = head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
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
