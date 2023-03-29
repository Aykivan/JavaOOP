package Practice1.model;

public class ProductChocolate extends Product{
    public ProductChocolate(String name, Double cost) {
        super(name, cost);
    }

    private int sugar;

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public ProductChocolate(String name, Double cost, int sugar) {
        super(name, cost);
        this.sugar = sugar;
    }
}
