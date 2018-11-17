package practice.design.patterns.strategy;

public class Pistol implements Weapon {
    @Override
    public void attack() {
        System.out.println("Pistol Strategy.");
    }
}
