package HomeWork.controller;

import HomeWork.model.Client;
import HomeWork.service.ClientService;

import java.util.List;

public class ClientController {
    ClientService clientService = new ClientService();

    public void addClient(Client client){
        clientService.addClient(client);
    }

    public void deleteClient(Client client) {
        clientService.deleteClient(client);
    }

    public Client getClient(Client client) {
        return clientService.getClient(client);
    }

    public List<Client> getClientList(){
        return clientService.getClientList();
    }

    public void balancePlus(Client client, Integer sum) {
        clientService.balancePlus(client, sum);
    }

    public void balanceMinus(Client client, Integer sum) {
        clientService.balanceMinus(client, sum);
    }
}
