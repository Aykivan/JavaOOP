package Practice1;

import Practice1.model.*;

import java.util.ArrayList;

public class Ex1 {

    /**
     * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы initProducts (List <Product>)
     * сохраняющий в себе список исходных продуктов и getProduct(String name)
     */

    /**
     * Сделать класс товар абстрактным, создать несколько наследников (пример: БутылкаВоды),
     * сделать интерфейсом ТорговыйАвтомат и реализовать класс какого-то одного типа ТорговыйАвтомат (пример: ПодающийБутылкуВодыАвтомат)
     */

    /**
     * Создать перегруженный метод выдачи товаров ТорговымАвтоматом дополнив его доп. входным параметром (пример: getProduct(String name))
     * выдающий товар по имени, создать метод возвращающий товар по имени и какому-либо параметру товара getProduct(String name, int volume)
     */

    public static <List> void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProducts(new ProductChocolate("snikers", 100., 50));
        vendingMachine.addProducts(new ProductChocolate("mars", 110.));
        vendingMachine.addProducts(new ProductWater("water 0.5L", 50., 500));
        vendingMachine.addProducts(new ProductWater("water 1L", 80., 1000));

        System.out.println(vendingMachine.getProductByName("water"));
        System.out.println(vendingMachine.getProductByCost(100.));
        System.out.println(vendingMachine.getProductByName("water 0.5L", 500));

        ProductWater botl1 = new ProductWater("Cola", 100., 1000);
        ProductWater botl2 = new ProductWater("Cola", 110., 500);
        ProductWater botl3 = new ProductWater("Water", 50., 500);
        ProductWater botl4 = new ProductWater("Sprite", 140., 1000);
        ProductWater botl5 = new ProductWater("Sprite", 90., 500);

        ArrayList<Product> waterList = new ArrayList();
        waterList.add(botl1);
        waterList.add(botl2);
        waterList.add(botl3);
        waterList.add(botl4);
        waterList.add(botl5);

        WaterMachine waterMachine = new WaterMachine(waterList);
        System.out.println(waterMachine.getProduct("Cola"));
        System.out.println(waterMachine.getProduct("Sprite", 500));
    }
}
