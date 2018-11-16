package practice.design.patterns.decorator;

public class BlackFridayDeal extends SpecialPacking {

    @Override
    public void setPackage(Package aPackage) {
        super.setPackage(aPackage);
    }

    @Override
    public int retrievePackageQuantity() {
//        Extra Quantity, add behaviour at run time
        return super.retrievePackageQuantity() + 10;
    }

    @Override
    public void pack(int quantity) {
        super.pack(quantity);
    }
}
