package Threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {

    private ClientsQueue clientsQueue = new ClientsQueue();

    public ClientsQueue getClientsQueue() {
        return clientsQueue;
    }

    public synchronized void addClient(Person person) {
        clientsQueue.add(person);
    }

    public synchronized void writeClients() {
        System.out.println(clientsQueue.toString());
    }

}
