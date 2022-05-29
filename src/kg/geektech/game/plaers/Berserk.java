package kg.geektech.game.plaers;

public class Berserk extends Hero {

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        boss.setHealth(boss.getHealth() - (boss.getDamage()/2));
    }
}
