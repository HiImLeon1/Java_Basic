package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "이상봉";
        int hour = 15;


        System.out.println(name +"님, " + hour +"시 배송이 시작되었습니다");
        System.out.println(name +"님, 배송이 완료되었습니다");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다");
        System.out.println("학점은 " + grade + " 입니다");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14; //정교한 숫자
        float f = 3.14f; //double보다 간단
        System.out.println(d);
        System.out.println(f);
        //int는 -21억 ~ 21억 사이만 가능
        long l = 1000000000000L;
        l = 1_000_000_000L;
        System.out.println(l);



    }
}
