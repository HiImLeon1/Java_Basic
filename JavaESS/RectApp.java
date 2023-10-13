package ch4;

import java.util.Scanner; // util.* 하면 util의 모든것을 가져옴



public class RectApp {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Scanner scn = new Scanner(System.in);
        System.out.println("너비, 높이를 입력하세요 >>");
        rec.width = scn.nextInt();
        rec.height = scn.nextInt();
        System.out.println("입력받은 사각형의 면적은 " + rec.getArea() + " 입니다.");

        Rectangle rec2 = new Rectangle();
        System.out.println();
        System.out.println("2번째 너비, 높이를 입력하세요 >>");
        rec2.width = scn.nextInt();
        rec2.height = scn.nextInt();
        System.out.println("2번째 입력받은 사각형의 면적은 " + rec2.getArea() + " 입니다.");
        scn.close();


    }
}
