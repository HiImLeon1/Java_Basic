package btn3;

public class ShutDownButton extends Button{


    public ShutDownButton() {
        super("Shutdown");
    }

    @Override
    public void func() {
        System.out.println("프로그램 종료");
    }

}
