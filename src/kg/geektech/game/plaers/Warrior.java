package kg.geektech.game.plaers;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(int health, int damage, String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        Random rand = new Random();
        this.setDamage(this.getDamage() * rand.nextInt(3)+2);
    }
}
