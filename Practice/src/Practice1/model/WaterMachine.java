package Practice1.model;

import java.util.List;

public class WaterMachine implements Machine {
    private final List<Product> products;

    public WaterMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public ProductWater getProduct(String name, int volume){
        for(Product product: products){
            if(product instanceof ProductWater){
                if(product.getName().equalsIgnoreCase(name) && ((ProductWater) product).getVolume() == volume){
                    return (ProductWater) product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
