package practice.design.patterns.strategy;

public class Knife implements Weapon {
    @Override
    public void attack() {
        System.out.println("Knife Strategy.");
    }
}
