package ch4;

public class Method_overriding_ex extends MethodSample{
    @Override
    public int getSum(int i, int j) {
        return i + j + 100;
    }
    //Ctrl + O 하면 재정의(오버라이딩) 메소드 표시

    public static void main(String[] args) {


        }
    }
}
