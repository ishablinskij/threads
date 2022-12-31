package Threads;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Person> people = new ArrayList<>();

    public static void main(String[] args) {
        Shop shop = new Shop();
        MyThread myThread = new MyThread("Mot", shop);
        Thread thread = new Thread(myThread);
        MyThread myThread2 = new MyThread("Mot2", shop);
        Thread thread2 = new Thread(myThread2);
        MyThread myThread3 = new MyThread("Mot3", shop);
        Thread thread3 = new Thread(myThread3);
        MyThread myThread4 = new MyThread("Mot4", shop);
        Thread thread4 = new Thread(myThread4);
        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

}
