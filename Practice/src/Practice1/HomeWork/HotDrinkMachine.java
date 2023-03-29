package Practice1.HomeWork;

import Practice1.model.Machine;
import Practice1.model.Product;

import java.util.ArrayList;

public class HotDrinkMachine implements Machine {

    private ArrayList<HotDrink> hotList;

    public HotDrinkMachine() {
        hotList = new ArrayList<HotDrink>();
    }

    public void addHotDrink(HotDrink newItem) {
        hotList.add(newItem);
    }

    public ArrayList<HotDrink> getProductHW(String searchName) {
        ArrayList<HotDrink> result = new ArrayList<HotDrink>();
        for (HotDrink item : hotList) {
            if (item.getName().contains(searchName)) result.add(item);
        }
        return result;
    }

    public ArrayList<HotDrink> getProductHW(String searchName, double cost, int temp) {
        ArrayList<HotDrink> result = new ArrayList<HotDrink>();
        for (HotDrink item : hotList) {
            if (item.getName().contains(searchName) && item.getCost() == cost && item.getTemp() == temp) {
                result.add(item);
            }
        }
        return result;
    }

//    Абсолютно не понятен метод ниже, после такого семинара полная каша в голове. Хорошо, что адекватно объяснил один из студентов первую часть.
//    Появилось хоть какое-то понимание происходящего, поэтому все сделал по его подобию, а не по тому материалу, что вы давали. То, что вы нам показываете,
//    нам не знакомо. Так же мы не писали никакой документации о которой нам говорили на лекциях.
//    В середине семинара вас вообще не было, поэтому мы и пропустили создание WatterMachine. Это просто ужасное отношение.
//    Все, что описано в этом блоке нам не знакомо:

    /**
     * {
     * if(product instanceof ProductWater){
     * if(product.getName().equalsIgnoreCase(name) && ((ProductWater) product).getVolume() == volume){
     * return (ProductWater) product;
     * }
     * }
     * }
     * throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
     */

    @Override
    public Product getProduct(String name) throws IllegalStateException {
        return null;
    }
}