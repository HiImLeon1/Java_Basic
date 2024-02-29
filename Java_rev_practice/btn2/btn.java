package btn2;

public class btn {
    private static String mode = "LIGHT";

    public static void switchMode() {
        mode = mode.equals("LIGHT") ? "DARK" : "LIGHT";
    }

    private char print;
    private int space = 1;

    public btn(char p, int s) {
        this.print = p;
        this.space = s;
    }

    public void setSpace(int s) {
        if (space < 1 || space > 4) return;
        this.space = space;
    }

    public String getButtonInfo() {
        return "%c 버튼, %d 픽셀 차지".formatted(print, space * 4096);
    }

}
