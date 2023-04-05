package HomeWork;

import cw.Animal;

import java.util.Comparator;

public class HotComparable implements Comparator<HotProduct> {
    @Override
    public int compare(HotProduct o1, HotProduct o2) {
        return o1.getTemp() - o2.getTemp();
    }
}
