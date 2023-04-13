package HomeWork.model;

public class Client {
    private Integer clientID;
    private String name;
    private Integer balance;

    public Client(Integer clientID, String name, Integer balance) {
        this.clientID = clientID;
        this.name = name;
        this.balance = balance;
    }

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientID=" + clientID +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
