package studyAlone;

public class Main {
    int radius;
    String name;

    public Main() {
        radius = 1; name = "";

    }
    public Main(int r, String n) {
        radius = r; name = n;

    }
    public double getArea() {
        return 3.14*radius*radius;
    }

    public static void main(String [] args) {
        Main pizza;
        pizza = new Main();
        pizza.radius = 10;
        pizza.name = "게살피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적" + area);

        Main donut;
        donut = new Main();
        donut.radius = 2;
        donut.name = "던킨";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은" + area);
        System.out.println("종료");


    }


}
