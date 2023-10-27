package Midterm;

public class ArrayPassing {
    static void repalceArr(char a[]){
        for (int i = 0; i < a.length; i++) {
            switch (a[i]){
                case ' ':{
                    a[i] = ',';
                    break;

                }default:
                    break;
            }
        }
    }
    static void showArr(char a[]){
        System.out.println(a);
    }

    public static void main(String[] args) {
        char c [] = {'H','e','l','l','o',' ','J','a','v','a'};
        showArr(c);
        repalceArr(c);
        showArr(c);
    }
}
