package btn;

public class btn {
    static String mode = "LIGHT";

    static void switchMode() {
        mode = mode.equals("LIGHT") ? "DARK" : "LIGHT";
    }
    char print;
    int space;
    btn(char p, int s){
        this.print = p;
        this.space = s;
    }
    void place(){
        System.out.printf(
                "표시:%c, 공간:%s, 모드:%s%n",
                print,space,mode
        );
    }
}
