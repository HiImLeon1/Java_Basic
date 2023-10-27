package Midterm;
class Point{
    private int x, y;
    public Point(){
        this.x = 0; this.y = 0;
    }
    public Point(int x, int y){
        this.x = x; this.y = y;
    }
    public void showPoint(){
        System.out.println("(" + x + "," + y + ")");
    }
}
public class Colorpoint extends Point {
    private String color;
    public Colorpoint(int x, int y, String color){
        super(x,y);
        this.color = color;
    }
    public void showColorPoint(){
        System.out.print(color);
        showPoint();
    }

    public static void main(String[] args) {
        Colorpoint cp = new Colorpoint(5,6,"Blue");
        cp.showColorPoint();
    }
}
