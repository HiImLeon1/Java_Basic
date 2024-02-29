package yc;

public class ChickenMenu {
    String name;
    int price;
    String cook = "fry";

    public ChickenMenu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public ChickenMenu(String name, int price, String cook) {
        this.name = name;
        this.price = price;
        this.cook = cook;
    }
}
