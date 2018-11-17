package practice.design.patterns.strategy;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.runSimpleStrategy();
        app.runLambdaStrategy();
    }

    private void runLambdaStrategy() {
        System.out.println("Running Lambda Strategy");
        Weapon knifeStrategy = () -> System.out.println("Knife Strategy");
        runStrategy(knifeStrategy);
        Weapon PistolStrategy = () -> System.out.println("Pistol Strategy");
        runStrategy(PistolStrategy);
        Weapon GunStrategy = () -> System.out.println("Gun Strategy");
        runStrategy(GunStrategy);
    }

    private void runStrategy(Weapon knifeStrategy) {
        knifeStrategy.attack();
    }

    private void runSimpleStrategy() {
        System.out.println("Running Simple Strategy");
        Game game = new Game(new Knife());
        game.changeWeapon(new Pistol());
        game.changeWeapon(new Gun());
    }
}
