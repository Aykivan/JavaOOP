package Practice1.HomeWork;

public class mainHW {

    /**
     * 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
     * 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
     * getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
     * 3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
     * 4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
     */
    public static void main(String[] args) {

        HotDrinkMachine hotList = new HotDrinkMachine();
        hotList.addHotDrink(new HotDrink("Black Tea", 10., 90));
        hotList.addHotDrink(new HotDrink("Green Tea", 15., 85));
        hotList.addHotDrink(new HotDrink("Coffee", 100., 90));
        hotList.addHotDrink(new HotDrink("Latte", 120., 80));

        System.out.println(hotList.getProductHW("Black Tea", 10., 90));
    }
}
