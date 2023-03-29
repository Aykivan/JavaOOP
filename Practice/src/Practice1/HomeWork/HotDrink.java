package Practice1.HomeWork;

import Practice1.model.Product;

public class HotDrink extends Product {

    private int temp;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public HotDrink(String name, Double cost, int temp) {
        super(name, cost);
        this.temp = temp;
    }
}
