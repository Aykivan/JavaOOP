package HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {

        HotMachine hotList = new HotMachine();
        hotList.addProduct(new HotProduct("coffee", 40, 80));
        hotList.addProduct(new HotProduct("black tea", 20, 70));
        hotList.addProduct(new HotProduct("green tea", 30, 60));
        hotList.addProduct( new HotProduct("chocolate", 60, 75));

        ArrayList<HotProduct> list = new ArrayList<>();
        list.add(new HotProduct("coffee", 40, 80));
        list.add(new HotProduct("black tea", 20, 70));
        list.add(new HotProduct("green tea", 30, 60));
        list.add( new HotProduct("chocolate", 60, 75));

        Integer minTemp = 70;
        Iterator<HotProduct> iterator = list.iterator();
        while (iterator.hasNext()) {
            HotProduct next = iterator.next();
            System.out.println(next);
            if (next.getTemp() < minTemp) {
                iterator.remove();
            }
        }
        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println(list);

        System.out.println("--------------------------------------------------------------------------------------");

        Collections.sort(list, new HotComparable());
        System.out.println(list);
    }
}
