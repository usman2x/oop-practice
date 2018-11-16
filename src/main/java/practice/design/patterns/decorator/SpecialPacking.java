package practice.design.patterns.decorator;

public class SpecialPacking implements Package {
    private Package aPackage;

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    @Override
    public String retrievePackageMaterial(int quantity) {
        return aPackage.retrievePackageMaterial(quantity);
    }

    @Override
    public void pack() {
        aPackage.pack();
    }
}
