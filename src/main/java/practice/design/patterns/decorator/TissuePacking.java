package practice.design.patterns.decorator;

public class TissuePacking implements Package {
    private int quantity;

    @Override
    public String retrievePackageMaterial(int quantity) {
        this.quantity = quantity;
        return "OK";
    }

    @Override
    public void pack() {
        System.out.println("Packing Tissues with Quantity " + this.quantity);
    }
}
