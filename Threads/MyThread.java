package Threads;

public class MyThread implements Runnable{

    //name od person
    private String name;

    private Shop shop;

    public MyThread(String name, Shop shop) {
        this.name = name;
        this.shop = shop;
    }


    @Override
    public void run() {
        shop.addClient(new Person(name));
        System.out.println(shop.getClientsQueue().getSize());
        shop.writeClients();
    }
}
