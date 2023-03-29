package Practice1.Cat;

public class Cat extends CatMover implements CatInterface {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void saySomething() {
        System.out.println("Meow");
    }

    public void say() {
        System.out.println(name);
    }

    @Override
    public void sayWithInterface() {
        System.out.println("Meow with interface");
    }
}
