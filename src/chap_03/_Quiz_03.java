package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {

        //주민등록번호는 13자리로 구성.
        //앞 6자리는 생년월일 정보, 뒷 7자리중 첫번째는 성별 정보
        //입력 데이터는 -를 포함한 14자리의 문자열 형태

        String man = "901231-1234567";// 901231-1 까지 출력
        String wom = "030708-4567890";// 030708-4 까지 출력

        System.out.println(man.substring(man.indexOf("9"), man.lastIndexOf("2"))); // 9부터 2 이전까지
        System.out.println(man.substring(0, man.indexOf("-") + 2)); // 0부터 하이픈 위치 직전 +2 까지
        System.out.println(man.substring(0, 8));// 0 위치부터 8 직전까지
        System.out.println(wom.substring(wom.indexOf("0"), wom.indexOf("5")));
        System.out.println(wom.substring(0, 8)); //마찬가지


    }
}
