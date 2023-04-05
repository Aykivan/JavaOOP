package HomeWork;

import java.util.Iterator;
import java.util.List;

public class HotMachineIterator implements Iterator<HotProduct> {

    private int counter;
    private List<HotProduct> finalProducts;

    public HotMachineIterator(HotMachine hotMachine) {
        this.finalProducts = hotMachine.getProducts();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < finalProducts.size();
    }

    @Override
    public HotProduct next() {
        if (!hasNext()) {
            return null;
        }
        counter++;
        return finalProducts.get(counter);
    }
}
