package Midterm;

import java.util.Scanner;

public class Phone {
    private String name, tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    public String getName(){
        return name;
    }
    public String getTe(){
        return tel;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Phone [] p = new Phone[2];
        for (int i = 0; i < p.length; i++) {
            System.out.print("이름과 전화번호 입력>>");
            p[i] = new Phone(scn.next(), scn.next());
        }
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].name + " " + p[i].tel);

            scn.close();
        }
    }
}
