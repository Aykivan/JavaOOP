package Practice2.cw2;

public interface QueueBehavior {

    public void takeInQueue(Actor actor);
    public void takeOrders();
    public void giveOrders();
    public void releaseFromQueue();
}
