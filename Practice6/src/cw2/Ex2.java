package cw2;

public class Ex2 {
    public static void main(String[] args) {
        Addition add = new Addition(1.0, 1.0);
        Calculator calc = new Calculator();
        calc.calculateSwitch(add);
        System.out.println(add.getResult());
    }

}
