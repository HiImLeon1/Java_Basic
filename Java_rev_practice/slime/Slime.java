package slime;

public class Slime {
    double hp = 50;
    int attack = 8;
    double defence = 0.2;

    void attack(Slime enemy) {
        enemy.hp -= attack * (1 - enemy.defence);


    }
}
