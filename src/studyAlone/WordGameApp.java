package studyAlone;

import java.util.Scanner;

class player{
    String word;
    Scanner sc = new Scanner(System.in);
    void getWordFromUser(){
        System.out.println();
        this.word = sc.next();
    }
    void checkSuccess(){
        int lastIndex = word.length() -1; // 마지막 문자에 대한 인덱스
        char lastChar = word.charAt(lastIndex); // 마지막 문자
        char firstChar = word.charAt(0); // 첫번째 문자
    }
     static void run(){
        
     }

}
public class WordGameApp {
    public static void main(String[] args) {
        player.run();
    }
}
