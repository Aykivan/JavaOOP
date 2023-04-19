public class Dog extends Animals{
    private String breed;
    private int hunger;

    public Dog(String breed, int hunger) {
        this.breed = breed;
        this.hunger = hunger;
    }

    @Override
    public void voice() {

    }

    @Override
    public void feed(int hunger) {

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public String toString() {
        return "Dog{" + name + age +
                "breed='" + breed + '\'' +
                ", hunger=" + hunger +
                '}';
    }
}
