package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        // 1등 : 전액 장학금 2등 : 반액 장학금 3등 : 반액 장학금 4등+ : 없음
        int ranking = 1; //1th

        //if else문을 이용한 방법
        if (ranking == 1) {
            System.out.println("All");
        } else if (ranking == 2) {
            System.out.println("Half");
        } else if (ranking == 3) {
            System.out.println("Half");
        } else {
            System.out.println("Nope.");

        }
        System.out.println("End #1");


        //switch문을 이용
        ranking = 1;
        switch (ranking) {
            case 1:
                System.out.println("All");
                break;
            case 2:
                System.out.println("Half");
                break;
            case 3:
                System.out.println("Half");
                break;
            default:
                System.out.println("Nope");
        }
        System.out.println("End #2");
        //case 2와 3을 통합

        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("All");
                break;
            case 2:
            case 3:
                System.out.println("Half");
                break;
            default:
                System.out.println("Nope");
        }
        System.out.println("End #3");

        //중고 상품의 등급에 따른 가격을 책 ( 1급 : 최상, 4급:최하)
        int grade = 1;
        int price = 7000;
            switch (grade){
                case 1:
                    price += 1000;
                case 2:
                    price += 1000;
                case 3 :
                    price += 1000;
                    break;

            }
        System.out.println(grade + "등급 가격은" + price + "원"  );
    }
}