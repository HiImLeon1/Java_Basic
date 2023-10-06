package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I Like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length()); //29(문자열의 길이)

        //대소문자 변환
        System.out.println(s.toUpperCase());//대문자로
        System.out.println(s.toLowerCase());//소문자로
        System.out.println(s);

        //포함관계
        System.out.println(s.contains("Java"));//포함되면 true
        System.out.println(s.contains("C#"));//포함되지 않으면 false
        System.out.println(s.indexOf("Java"));//위치정보 7
        System.out.println(s.indexOf("C#"));//포함되지 않으면 -1 반환
        System.out.println(s.indexOf("and"));//처음 위치 반환 (12)
        System.out.println(s.lastIndexOf("and"));//마지악 위치 반환.
        System.out.println(s.startsWith("I Like"));//이 문자열로 시작하면 True, 아니면 False
        System.out.println(s.endsWith("and C."));//이 문자열로 끝나면 True, 아니면 False

    }
}
