package practice.design.patterns.decorator;

public abstract class SpecialPacking implements Package {
    private Package aPackage;

    public void setPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    @Override
    public int retrievePackageQuantity() {
        return aPackage.retrievePackageQuantity();
    }

    @Override
    public void pack(int quantity) {
        aPackage.pack(quantity);
    }
}
