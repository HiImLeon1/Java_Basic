package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {

        //문자열 비교
        String s1 = "Java";
        String s2 = "PythOn";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true, 아니면 false
        System.out.println(s1.equals("Java"));//true
        System.out.println(s2.equals("python"));//false (대소문자 구분함)
        System.out.println(s2.equalsIgnoreCase("python"));//대소문자 구분없이 문자열 내용이 같은지 여부.

        //문자열 비교 심화
        s1 = "1234"; //벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // true

        s1 = new String("1234"); //new String으로 만들면 메모에 각각 저장됨(참조 x)
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); //true 내용은 같음
        System.out.println(s1 == s2); //false 참조가 다름(메모리 공간 다름)

        //부가설명.
        //equals는 문자열만 비교함
        //등호 (==)는 전체 참조(같은 공간에 있냐)여부를 비교

    }
}
