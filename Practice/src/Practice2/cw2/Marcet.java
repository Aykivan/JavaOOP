package Practice2.cw2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Marcet implements MarketBehavior, QueueBehavior {
    /**
     * 1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди, принятие/отдача заказа
     * 2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей, обновление состояния магазина
     * 3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке список людей в очереди в различных статусах
     */
    List<Actor> someList1 = new ArrayList<>();
    Queue<Actor> someList2 = new LinkedList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        someList1.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        someList1.remove(actor);
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Actor actor) {
        someList2.add(actor);
    }

    @Override
    public void takeOrders() {
        someList2.peek().setTakeOrder();
    }

    @Override
    public void giveOrders() {
        someList2.peek().setMakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        someList2.poll();
    }
}
