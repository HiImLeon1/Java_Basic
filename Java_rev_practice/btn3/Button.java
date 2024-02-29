package btn3;

public class Button {

    private String print;

    public Button(String p){
        this.print = p;
    }

    public void func(){
        System.out.println(print + " 입력 적용");
    }
}
