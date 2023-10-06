package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        //조건문 if else
        int hour = 15;
        if (hour < 14){//오후 2시 이전이면
            System.out.println("아이스 아메리카노 +1");
        }
        else { //그 외의 경우이면
            System.out.println("디카페인 아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");

        // 오후 2시 이후이거나 모닝커피를 마신 이후라면?
        hour = 15;
        boolean morningCoffee = false;
        if (hour >=14 || morningCoffee){//14시 넘었거나 모닝커피를 마셨으면
            System.out.println("아이스 아메리카노 디카페인 +1");
        }
        else {//그 외의 경우이면
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");
    }
}
