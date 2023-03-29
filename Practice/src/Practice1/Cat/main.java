package Practice1.Cat;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Barsik");
        System.out.println(cat.getName());
        cat.saySomething();
        cat.sayWithInterface();
        BengalCat catB = new BengalCat();
        catB.saySomething();
    }
}
