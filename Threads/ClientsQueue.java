package Threads;

import java.util.*;


public class ClientsQueue {

    private volatile int size = 0;

    private volatile Person[] elementData = new Person[0];

    private synchronized Person[] grow(Person[] elementData) {
        Person[] persons;
        if (elementData.length >= 1) {
            persons = new Person[elementData.length + 1];
            for (int i = 0; i < elementData.length; i++) {
                persons[i] = elementData[i];
            }
        } else {
            persons = new Person[elementData.length + 1];
        }
        return persons;
    }

    private synchronized void add(Person e, int s) {
        if (s == elementData.length)
            elementData = grow(elementData);
        elementData[s] = e;
        size = elementData.length;
    }

    public synchronized boolean add(Person e) {
        add(e, getSize());
        return true;
    }

    public synchronized int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (elementData[0] == null) {
            return "Clients queue is empty";
        }
        for (int i = 0; i < elementData.length; i++) {
            stringBuilder.append("[");
            stringBuilder.append(elementData[i].toString());
            stringBuilder.append("]");
            stringBuilder.append(",");
        }
        return stringBuilder.toString();
    }
}
