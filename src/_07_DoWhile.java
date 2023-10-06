package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {

        //반복문 Do While
        int distance = 25; //수영장 전체 25
        int move = 0; //현재 이동 거리 0
        int height = 2; //키가 2미터
        while (move + height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;


        }
        System.out.println("도착했습니다");
        System.out.println("#1");
        //키가 엄청나게 큰 사람
        move = 0;
        height = 25; //키가 무.려 25미터?
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;

        }
        System.out.println("도착했습니다.");
        System.out.println("#2");
        // do while 반복문 -> 최소 1번은 실행됨

        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;


        }
        while (move + height < distance) ;
        System.out.println("도착했습니다");
    }
}
