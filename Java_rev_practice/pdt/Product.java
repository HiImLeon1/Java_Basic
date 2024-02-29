package pdt;

public class Product {
    private static double discount = 0.2;
    private static double increaseLimit = 1.2;

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())return;
        this.name = name;
    }

    public int getPrice() {
        return (int) (price*(1-discount));
    }

    public void setPrice(int price) {
        int max = (int) (price * increaseLimit);
        this.price = price < max ? price : max;
    }
}
