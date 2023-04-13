package HomeWork.service;

import HomeWork.model.Client;
import HomeWork.repository.ClientRepo;

import java.util.List;

public class ClientService {

    public ClientRepo clientRepo = new ClientRepo();

    public void addClient(Client client) {
        if (!clientRepo.equals(client)) {
            clientRepo.addClient(client);
        } else System.out.println("Такой клиент уже существует");
    }

    public void deleteClient(Client client) {
        clientRepo.deleteClient(client);
    }

    public Client getClient(Client client) {
       return clientRepo.getClient(client);
    }

    public List<Client> getClientList() {
        return clientRepo.getClientList();
    }

    public void balancePlus(Client client, Integer sum) {
        clientRepo.balancePlus(client, sum);
    }
    public void balanceMinus(Client client, Integer sum) {
        if (clientRepo.getBalance(client) - sum >= 0) clientRepo.balanceMinus(client, sum);
        else System.out.println("У вас недостаточно средств");
    }
}
