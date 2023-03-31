package Practice2.cw1;

public abstract class Actor implements ActorBehavior {
    protected String name;
    abstract String getName();

    @Override
    public boolean isMakeOrder() {
        return true;
    }

    @Override
    public boolean isTakeOrder() {
        return true;
    }
}
