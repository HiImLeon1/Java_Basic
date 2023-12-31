package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술 연산자

        //일반 연산
        System.out.println(4 + 2); //6
        System.out.println(4 - 2); //2
        System.out.println(4 * 2); //8
        System.out.println(4 / 2); //2
        System.out.println(5 / 2); //2.5
        System.out.println(2 / 4); //0.5
        System.out.println(4 % 2); //4를 2로 나눴을때 나머지 ->0
        System.out.println(5 % 2); //1

        //우선 순위에 따른 연산
        System.out.println(2 + 2 * 2);//6
        System.out.println((2 + 2) * 2);//8
        System.out.println(2 + (2 * 2));//6

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;
        c = a + b;
        System.out.println(c);//30
        c = a - b;
        System.out.println(c);//10
        c = a * b;
        System.out.println(c);//200
        c = a / b;
        System.out.println(c);//2
        c = a % b;
        System.out.println(c);//0

        //증강 연산
        int val;
        val = 10;
        System.out.println(val); //10
        System.out.println(++val); // 11
        val = val + 1;
        System.out.println(val);//12

        val = 10;
        System.out.println(val);//10
        System.out.println(val++);//val 다음 ++ 위치에 따라 처리순서가 달라짐(해당 코드는 출력 후 ++됨) 10
        System.out.println(val);//11

        val = 10;
        System.out.println(val);//10
        System.out.println(--val);//9
        System.out.println(val--);//위와동일 //9
        System.out.println(val);//8

//        은행 대기인원
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++);//대기 인원 0
        System.out.println("대기 인원 : " + waiting++);//대기 인원 1
        System.out.println("대기 인원 : " + waiting++);//대기 인원 2
        System.out.println("총 대기 인원 : " + waiting);//대기 인원 3


    }
}
