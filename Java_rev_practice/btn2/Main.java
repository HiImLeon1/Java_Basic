package btn2;

public class Main {

    public static void main(String[] args) {
        btn btn1 = new btn('1',1);
        btn.switchMode();

//        btn1.space = 3; 불가
        btn1.setSpace(3);
        btn1.setSpace(-1);

//        char btn1Print = btn1.print;불가
        String btn1Info = btn1.getButtonInfo();
    }

}
