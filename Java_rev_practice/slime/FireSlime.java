package slime;

public class FireSlime extends Slime{

    private int fireAttack = 6;

    @Override
    void attack(Slime enemy) {
        enemy.hp -= (attack+fireAttack) * (1-enemy.defence);
    }
}
