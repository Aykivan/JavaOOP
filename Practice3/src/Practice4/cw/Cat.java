package Practice4.cw;

public class Cat extends Animal {

    private String catcorm;

    public Cat(String name, String catcorm) {
        super(name);
        this.catcorm = catcorm;
    }

    public String getCatcorm() {
        return catcorm;
    }

    public void setCatcorm(String catcorm) {
        this.catcorm = catcorm;
    }

    @Override
    public String toString() {
        return "Cat{" +  "name=" + getName() + " Catcorm=" + catcorm + '}';
    }
}
