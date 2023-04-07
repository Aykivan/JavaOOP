package Practice4.cw;

public class Dog extends Animal{
    private String dogcorm;

    public Dog(String name, String dogcorm) {
        super(name);
        this.dogcorm = dogcorm;
    }

    public String getDogcorm() {
        return dogcorm;
    }

    public void setDogcorm(String dogcorm) {
        this.dogcorm = dogcorm;
    }

    @Override
    public String toString() {
        return "Dog{" +  "name=" + getName() + " Dogcorm=" + dogcorm + '}';
    }
}
