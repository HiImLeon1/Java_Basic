package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 나코 매장
        System.out.println("어서오세요 나코입니다");
        //또 다른 손님이 들어오면?
        System.out.println("어서오세요 나코입니다");
        System.out.println("어서오세요 나코입니다");
        System.out.println("어서오세요 나코입니다");
        System.out.println("어서오세요 나코입니다");
        System.out.println("어서오세요 나코입니다");
        //만약에 인사법이 바뀌면?
        System.out.println("환영합니다 나코입니다");
        System.out.println("환영합니다 나코입니다");
        System.out.println("환영합니다 나코입니다");
        //매장 이름이 바뀌면?
        System.out.println("환영합니다 코나입니다");
        System.out.println("환영합니다 코나입니다");
        System.out.println("환영합니다 코나입니다");
        System.out.println("banbok");

        // 반복문 사용 for
        for ( int i = 0; i < 10; i++ ) {
            System.out.println("Welcome " + i);

            }
        //짝수만 출력 (귀찮으면 fori 엔터)
        // 0, 2, 4, 6, 8
        for (int i = 0; i < 10; i+= 2) {
            System.out.print(i);

            
        }
        System.out.println();
        //홀수만 출력
        for (int i = 1; i < 10; i+= 2) {
            System.out.print(i);
        }
        //거꾸로 숫자 출력
        System.out.println();
        for (int i = 5; i > 0 ; i-- ) {
            System.out.print(i);
            
        }
        //1 부터 10까지의 수를 합
        System.out.println();
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);
        }


    }

