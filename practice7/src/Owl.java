public class Owl extends Animals{
    private boolean isDomesticated;
    private int hunger;

    public Owl(boolean isDomesticated, int hunger) {
        this.isDomesticated = isDomesticated;
        this.hunger = hunger;
    }

    @Override
    public void voice() {

    }

    @Override
    public void feed(int hunger) {

    }

    public boolean isDomesticated() {
        return isDomesticated;
    }

    public void setDomesticated(boolean domesticated) {
        isDomesticated = domesticated;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public String toString() {
        return "Owl{" + name + age +
                "isDomesticated=" + isDomesticated +
                ", hunger=" + hunger +
                '}';
    }
}
