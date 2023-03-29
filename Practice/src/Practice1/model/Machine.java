package Practice1.model;

public interface Machine {
    Product getProduct(String name) throws IllegalStateException;
}
