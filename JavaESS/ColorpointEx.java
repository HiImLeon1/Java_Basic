package ch5;

import java.awt.*;

class Point{
    private int x,y;
    public void set(int x, int y){
        this.x = x; this.y = y;
    }
    public void showPoint(){
        System.out.println("(" + x + "," + y + ")");
    }


}
class Colorpoint extends Point{
    private String color;
    public void setColor(String color){
        this.color = color;
    }
    public void showColorPoint(){
        System.out.print(color);
        showPoint();
    }
}
public class ColorpointEx {
    public static void main(String[] args) {
        Point p = new Point();
        p.set(1,2);
        p.showPoint();

        Colorpoint cp = new Colorpoint();
        cp.set(3,4);
        cp.setColor("red");
        cp.showColorPoint();

    }

}
