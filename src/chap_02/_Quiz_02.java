package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 115;
        int cut = 120;
        // 키가 120cm 이상인 경우 탑승가능 출력
        // 삼항 연산자 이용
        String can = (height >= cut) ? "탑승 가능합니다" : "탑승 불가합니다";
        System.out.println("키가 " + height + "이므로 " + can);


        height = 121;
        can = height >= cut ? "가능" : "불가능";
        System.out.println("키가 "+ height + "이므로 " + can);

    }
}
