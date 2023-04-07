package Practice4.cw;

public class main {
    public static void main(String[] args) {
        HomePets mypets = new HomePets();
        Cat mycat = new Cat("Vafel", "Vafelcorm");
        Dog mydog = new Dog("Rex", "Rexcorm");

        mypets.addPet(mycat);
        mypets.addPet(mydog);

        System.out.println(mypets);

        // 59:00 zip archive
    }
}
