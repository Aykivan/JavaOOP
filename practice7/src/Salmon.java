public class Salmon{
    private boolean isCooked;

    public Salmon(boolean isCooked) {
        this.isCooked = isCooked;
    }

    public boolean isCooked() {
        return isCooked;
    }

    public void setCooked(boolean cooked) {
        isCooked = cooked;
    }

    @Override
    public String toString() {
        return "Salmon{" +
                "isCooked=" + isCooked +
                '}';
    }
}
