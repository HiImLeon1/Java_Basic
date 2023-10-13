package ch4;

public class Circle {

    int radius;
    String name;
//    생성자의 이름은 클래스와 동일, Return 타입이 없어야 한다.
    public Circle(){
        radius = 1;
        name = "";
    }
    public Circle(int r, String n){
        radius = r;
        name = n;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle pizza;
        pizza = new Circle();
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은" + area);

        Circle donut = new Circle(10,"자바도넛");
//         donut.radius = 2;
//        donut.name = "자바도넛"; 이 () 안에 들어감.
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은" + area);
    }

}
