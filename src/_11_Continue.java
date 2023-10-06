package chap_04;

public class _11_Continue {
    public static void main(String[] args) {

        // Continue

        //치킨 주문 손님중에 노쇼가 있다고 가정.
        // for
        int max = 20; //최대 치킨 판매 수량
        int sold = 0; //현재 치킨 판매 수량
        int noshow = 17;//대기번호 17번이 노쇼임
        for (int i = 1; i <= 50; i++) {

            System.out.println(i + "'s chicken");

            // 주문한 손님이 없다면?
            if (i == noshow){
                System.out.println(i + "'s chicken next");
                continue;
            }
            sold++;//판매처리
            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업 종료");
        System.out.println("-------------");

        // while문
        sold = 0;
        noshow = 15;
        int index = 0; //orderlist
        while(true){ //index<=50){
            index++;
            System.out.println(index + "'s chicken.");
            //손님이 없다면 (노쇼)
            if (index == noshow){
                System.out.println(noshow + "'s chicken next");

                continue;
            }
            sold++;
            if (sold == max){
                System.out.println("no ingredients!");
                break;
            }
        }
        System.out.println("영업종료");

    }
}
