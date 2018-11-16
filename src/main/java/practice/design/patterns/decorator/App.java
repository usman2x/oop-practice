package practice.design.patterns.decorator;

public class App {
    public static void main(String[] args) {
        TissuePacking tissuePacking = new TissuePacking();
        tissuePacking.retrievePackageMaterial(50);
        tissuePacking.pack();

        SpecialPacking specialPacking = new SpecialPacking();
        specialPacking.setaPackage(tissuePacking);
    }
}
