package slime;

public class Main {
    public static void main(String[] args) {
        Slime slime1 = new Slime();
        FireSlime slime2 = new FireSlime();
        slime2.attack(slime1);
        slime1.attack(slime2);
    }
}
