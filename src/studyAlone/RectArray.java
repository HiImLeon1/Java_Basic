package studyAlone;

import java.util.Scanner;

class  rect{
    private int width, height;
    public rect(int w, int h){
        this.width = w;
        this.height = h;
    }
    public int getArea(){
        return width * height;
    }
}

public class RectArray {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        rect[] r = new rect[4];
        for (int i = 0; i < 4; i++) {
            System.out.println(i + " 너비와 높이 >>");
            r[i] = new rect(sc.nextInt(),sc.nextInt());
            sum = sum + r[i].getArea();

        }

        System.out.println("저장하였습니다..");
        System.out.println(sum);
    }
}
