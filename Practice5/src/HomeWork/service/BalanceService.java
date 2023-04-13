package HomeWork.service;

import HomeWork.model.Client;
import HomeWork.repository.ClientRepo;

public class BalanceService extends ClientService{
    public ClientRepo clientRepo = new ClientRepo();

    public void balancePlus(Client client, Integer sum) {
        clientRepo.balancePlus(client, sum);
    }

    public void balanceMinus(Client client, Integer sum) {
        if (clientRepo.getBalance(client) - sum >= 0) clientRepo.balanceMinus(client, sum);
        else System.out.println("У вас недостаточно средств");
    }
}
