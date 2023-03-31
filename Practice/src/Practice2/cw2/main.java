package Practice2.cw2;

public class main {
    public static void main(String[] args) {
        Human human = new Human();
        Marcet mac = new Marcet();
        mac.acceptToMarket(human);
        mac.takeInQueue(human);
        mac.takeOrders();
        mac.giveOrders();
        mac.releaseFromQueue();
        mac.releaseFromMarket(human);
    }
}
