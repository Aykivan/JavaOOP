package cw;

public class Dog extends Animal{
    public Dog(String name, Integer age, Integer weight) {
        super(name, age, weight);
    }

    @Override
    public String toString() {
        return "Dog: " + this.getName() + " || W: " + this.getWeight();
    }
}
