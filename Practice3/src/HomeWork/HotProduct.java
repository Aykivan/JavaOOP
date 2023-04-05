package HomeWork;

public class HotProduct extends Product implements Comparable<HotProduct>{

    private Integer temp;

    public HotProduct(String name, Integer cost, Integer temp) {
        super(name, cost);
        this.temp = temp;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotProd = " + getName() + " | cost = " + getCost() + " | temp = " + temp + '\'';
    }

    @Override
    public int compareTo(HotProduct o) {
        return 0;
    }
}
