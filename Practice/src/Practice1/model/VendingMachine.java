package Practice1.model;

import java.util.ArrayList;

public class VendingMachine implements Machine {

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

    public ArrayList<Product> getProductByName(String searchName, int volume) {
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product item : listProduct) {
            if (item.getName().contains(searchName) && ((ProductWater)(item)).getVolume() == volume) result.add(item);
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

    @Override
    public Product getProduct(String name) throws IllegalStateException {
        return null;
    }
}
