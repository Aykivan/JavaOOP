package Practice2.cw2;

import java.util.List;

public interface MarketBehavior {
    public void acceptToMarket(Actor actor);
    public void releaseFromMarket(Actor actor);
    public void update();

}
