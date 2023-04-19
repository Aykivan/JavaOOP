public class Cat extends Animals{
    private boolean isInGoodMood;
    private int hunger;

    public Cat(boolean isInGoodMood, int hunger) {
        this.isInGoodMood = isInGoodMood;
        this.hunger = hunger;
    }

    @Override
    public void voice() {

    }

    @Override
    public void feed(int hunger) {

    }

    public boolean isInGoodMood() {
        return isInGoodMood;
    }

    public void setInGoodMood(boolean inGoodMood) {
        isInGoodMood = inGoodMood;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public String toString() {
        return "Cat{" + name + age +
                "isInGoodMood=" + isInGoodMood +
                ", hunger=" + hunger +
                '}';
    }
}
