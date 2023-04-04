package cw;

public class Cat extends Animal{
    public Cat(String name, Integer age, Integer weight) {
        super(name, age, weight);
    }

    @Override
    public String toString() {
        return "Cat: " + this.getName() + "| W: " + this.getWeight();
    }
}
