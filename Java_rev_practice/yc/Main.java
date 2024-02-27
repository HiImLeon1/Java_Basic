package yc;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        YalcoChicken store1 = new YalcoChicken(1,"울산");

        YalcoChicken store2 = new YalcoChicken(3,"삼산");

      String[] intros = {store1.intro(), store2.intro()};
        System.out.printf(Arrays.toString(intros));
        String h = store1.intro();
        System.out.println(h);
    }
}
