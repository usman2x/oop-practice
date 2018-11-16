package practice.design.patterns.decorator;

public class TissuePacking implements Package {

    @Override
    public int retrievePackageQuantity() {
        return 50;
    }

    @Override
    public void pack(int quantity) {
        System.out.println("Packing Tissues with Quantity " + quantity);
    }
}
