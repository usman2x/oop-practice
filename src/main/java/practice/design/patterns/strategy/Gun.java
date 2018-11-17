package practice.design.patterns.strategy;

public class Gun implements Weapon {
    @Override
    public void attack() {
        System.out.println("Gun Strategy");
    }
}
