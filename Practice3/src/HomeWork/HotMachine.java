package HomeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HotMachine implements Machine, Iterable<HotProduct> {

    private ArrayList<HotProduct> hotList;

    public HotMachine() {
        this.hotList = new ArrayList<HotProduct>();
    }

    public void addProduct(HotProduct newProd) {
        hotList.add(newProd);
    }

    public List<HotProduct> getProduct;

    @Override
    public String toString() {
        for(HotProduct product : hotList){
            System.out.println(product);
        }
        return null;
    }

    public List<HotProduct> getProducts() {
        return hotList;
    }

    @Override
    public Iterator<HotProduct> iterator() {
        return new HotMachineIterator(this);
    }
}
