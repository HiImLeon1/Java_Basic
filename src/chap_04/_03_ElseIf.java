package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        //조건문 elseif
        //한라봉 에이드가 있으면 +!
        //또는 망고 주스가 있으면 +!
        //또는 그냥 아.아 +!
        boolean tangerinAde = false; //한라봉 에이드
        boolean mangoJuice = false; //망고주스
        boolean orange = true;
        if (tangerinAde){
            System.out.println("한라봉 에이드 +1");
        }
        else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        }
        else if (orange){
            System.out.println("오렌지 주스 +1");

        }
        else {
            System.out.println("아이스 아메리카노 +!");
        }
        System.out.println("커피 주문 완료");
    }
}
