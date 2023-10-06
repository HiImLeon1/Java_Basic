package chap_03;

public class _02_String2 {
    public static void main(String[] args) {

        String s = "I Like Java and Python and C.";

        //문자열 변환
        System.out.println(s.replace(" and", ","));//(공백)and를 ,로 변환해서 출력.
        System.out.println(s.substring(7));// 인덱스 기준 7부터 시작 ( 이전 내용은 삭제 )
        System.out.println(s.substring(s.indexOf("Java")));// Java라는 문자열 위치를 찾고, 해딩 인덱스 기준부터 시작
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));// 시작은 Java부터, 끝은 "." 직전까지 출력

        //공백 제거
        s = "         I Love Java.           ";
        System.out.println(s);
        System.out.println(s.trim());//불필요한 앞뒤 공백을 제거함.

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);//JavaPython
        System.out.println(s1 + "," + s2);//Java,Python
        System.out.println(s1.concat(",").concat(s2));//Java,Python


    }
}
