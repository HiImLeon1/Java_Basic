package pr;

public class he {
    char print;
    int space;
    String mode;
    he(char p, int s, String m){
        this.print = p;
        this.space = s;
        this. mode = m;
    }
    void place(){
        System.out.printf("표시: %c, 공간:%s, 모드:%s%n",
                print,space,mode
        );
    }
}
