package practice.design.patterns.strategy;

public class Game {
    private Weapon weapon;

    public Game(Weapon weapon) {
        this.weapon = weapon;
        attack(this.weapon);
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
        attack(this.weapon);
    }

    private void attack(Weapon weapon) {
        weapon.attack();
    }
}
