package studyAlone;

import java.util.Scanner;

public class Phone {
    private String name, tel;
    public Phone (String n, String t){
        this.name = n;
        this.tel = t;
    }

    public String getName() {
        return name;
    }
    public String getTel() {
        return tel;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 전번>>");
    Phone s = new Phone(sc.next(), sc.next());
        System.out.print("이름 전번>>");
    Phone p = new Phone(sc.next(), sc.next());
        System.out.println(s.getName() + s.getTel());
        System.out.println(p.getName() + p.getTel());
    }
}
