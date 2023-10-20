package studyAlone;

public class StringEqualsEx {
    public static void main(String[] args) {
        String a = new String("This");
        String b = new String("This");
        String c = a;
        if (a == b) {
            System.out.println("a==b");
        }
        if (a == c) {
            System.out.println("a==c");
        }
        if (a.equals(b)) {
            System.out.println("b equal a");
        }
    }

}
