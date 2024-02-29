package btn;

public class Main {
    public static void main(String[] args) {
        btn btn1 = new btn('1',1);
        btn btnPlus = new btn('+',2);
        btn btnClear = new btn('C',3);
        btn[] btns = {btn1,btnPlus,btnClear};

        System.out.println(btn.mode);
        for (btn ex : btns){ex.place();}
        btn.switchMode();
        System.out.println(btn.mode);
        for (btn ex : btns){ex.place();}
        btn.switchMode();

    }

}
