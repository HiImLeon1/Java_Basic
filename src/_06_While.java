package chap_04;

public class _06_While {
    public static void main(String[] args) {
        //반복문 while
        // 수영장에서 수영을 하고있음
        int distance = 25; //전체 거리는 25m
        int move = 0; //현재 이동 거리
        while (move < distance){ // 현재 아동 거리가 전체 거리보다 작다는 조건이 참인 동안 반복 수행
            System.out.println("수영을 계속 합니다\n"  + "현재 이동 거리는 " + move + " m 입니다\n");
            move += 3; //3미터 이동
        }
        System.out.println("도착했습니다");

    }
}
