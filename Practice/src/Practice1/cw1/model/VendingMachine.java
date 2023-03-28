package Practice1.cw1.model;

import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Product> listProduct;

    public VendingMachine() {
        listProduct = new ArrayList<Product>();
    }

    public void addProducts(Product newItem) {
        listProduct.add(newItem);
    }

    /**
     * @param searchName имя искомого продукта
     * @return возвращаем список найденных
     */
    public ArrayList<Product> getProductByName(String searchName) {
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product item : listProduct) {
            if (item.getName().contains(searchName)) result.add(item);
        }
        return result;
    }

    public ArrayList<Product> getProductByCost(Double searchCost) {
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product item : listProduct) {
            if (item.getCost().equals(searchCost)) result.add(item);
        }
        return result;
    }
}
