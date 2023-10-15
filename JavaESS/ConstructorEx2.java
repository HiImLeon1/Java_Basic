package ch5;
class A{
    int an;
    public A(){
        System.out.println("생성자 A");

    }
    public A(int x){
        this.an = x;
        System.out.println("매개변수" + x);

    }
}
class B extends A{
    public B(){
        System.out.println("생성자 B");
    }
    public B(int x){
        System.out.println("매개변수" + x);
    }
}
public class ConstructorEx2 {
    public static void main(String[] args) {
        B b;
        b = new B();
        A a;
        a = new A(1);
        B c;
        c = new B(0);

    }
}
