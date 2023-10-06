package chap_04;

import java.util.Scanner;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 조건문을 활용한 주차 정산 프로그램
        // 주차 요금은 시간당 4000(일일 최대 3만원)
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인
        int hour = 0; // 주차 시간
        int fee = 0; //토탈 요금

        int i = 1; //일반차량 코드 1
        int j = 2; //장애인차량 코드 2
        int g = 3; //경차 코드 3

        int code = 0; //차량 코드 선언
        Scanner scn = new Scanner(System.in);
        System.out.println("차량 코드를 입력해주세요");//입력받기(차량 코드랑 주차 시간, 응용해봤음)
        code = scn.nextInt();
        System.out.println("주차 시간을 입력해주세요");
        hour = scn.nextInt();

//        while (true) {
//            hour++;
//            if (hour > 24) ;
//            break;
//        }
        fee = hour * 4000; // 요금 4천원 x 시간 = 토탈요금
        if (fee > 30000){ // 토탈요금이 3만원 넘으면 3만원으로 통일
            fee = 30000;
            }
        if (code == 2 || code == 3){ // 경차나 장애인차량 50% 할인
            fee /= 2; // 할인율을 곱하는 방법 fee = (int)(fee * 0.5f); || fee*= 0.5f;

            }
        System.out.println("차량코드 " + code +", "+ hour + "시간 주차 요금은 " + fee + " 원 입니다." );
        // 이거 code + hour 하니까 왜 더해져서 나오는지 공부해보기

        }



    }

