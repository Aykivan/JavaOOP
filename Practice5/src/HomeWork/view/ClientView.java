package HomeWork.view;

import HomeWork.controller.ClientController;
import HomeWork.model.Client;

public class ClientView {

    /**
     * Реализовать систему работы банковского приложения.
     * - Создать класс пользователь и соответствующие классы
     * - Реализовать операции зачисления средств пользователю на счёт и списания(У пользователя должно быть отдельное поле - его баланс)
     * - Реализовать функции добавления и удаления пользователя
     */
    public static void main(String[] args) {
        ClientController clientController = new ClientController();
        Client client1 = new Client(1, "Cl1", 100);
        Client client2 = new Client(2, "Cl2", 200);
        Client client3 = new Client(3, "Cl3", 300);

//      Проверка getClient
        clientController.addClient(client1);
        System.out.println(clientController.getClient(client1));
        System.out.println("--------------------------------------------------------");

//      Проверка getClientList
        clientController.addClient(client2);
        System.out.println(clientController.getClientList());
        System.out.println("--------------------------------------------------------");

//      Проверка deleteClient
        clientController.deleteClient(client2);
        System.out.println(clientController.getClientList());
        System.out.println("--------------------------------------------------------");

//      Изменения баланса
        System.out.println();
        clientController.addClient(client3);

        clientController.balancePlus(client1, 100);
        clientController.balanceMinus(client3, 100);
        System.out.println(clientController.getClientList());
    }
}
