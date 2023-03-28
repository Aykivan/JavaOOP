package Practice1.cw1;

import Practice1.cw1.model.Product;
import Practice1.cw1.model.VendingMachine;

public class Ex1 {

    /**
     * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы initProducts (List <Product>)
     * сохраняющий в себе список исходных продуктов и getProduct(String name)
     */

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProducts(new Product("snikers", 100.));
        machine.addProducts(new Product("mars", 110.));
        machine.addProducts(new Product("water 0.5L", 50.));
        machine.addProducts(new Product("water 1L", 80.));

        System.out.println(machine.getProductByName("water"));
        System.out.println(machine.getProductByCost(100.));
    }
}
