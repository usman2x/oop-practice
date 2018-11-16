package practice.design.patterns.decorator;

public class LotionPacking implements Package {
    private int quantity;

    @Override
    public int retrievePackageQuantity() {
        return 50;
    }

    @Override
    public void pack(int quantity) {
        System.out.println("Packing Lotion with Quantity " + quantity);
    }
}
