package HomeWork.repository;

import HomeWork.model.Client;

import java.util.LinkedList;
import java.util.List;

public class ClientRepo {

    private List<Client> clientList = new LinkedList<>();

    public ClientRepo() {
        this.clientList = new LinkedList<>();
    }

    public void addClient(Client client) {
        clientList.add(client);
    }

    public void deleteClient(Client client) {
        clientList.remove(client);
    }

    public Client getClient(Client client){
        for (Client el : clientList) {
            if (el.getClientID().equals(client.getClientID())) {
                return el;
            }
        }
        return null;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public Integer getBalance(Client client){
        for (Client el : clientList) {
            if (el.getClientID().equals(client.getClientID())) {
                return el.getBalance();
            }
        }
        return null;
    }

    public void balancePlus(Client client, Integer sum) {
        for (Client el : clientList) {
            if (el.getClientID().equals(client.getClientID())) {
                el.setBalance(el.getBalance() + sum);
            }
        }
    }

    public void balanceMinus(Client client, Integer sum) {
        for (Client el : clientList) {
            if (el.getClientID().equals(client.getClientID())) {
                el.setBalance(el.getBalance() - sum);
            }
        }
    }
}
