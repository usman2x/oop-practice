package practice.design.patterns.decorator;

public class LotionPacking implements Package {
    private int quantity;

    @Override
    public String retrievePackageMaterial(int quantity) {
        this.quantity = quantity;
        return "OK";
    }

    @Override
    public void pack() {
        System.out.println("Packing Lotion with Quantity " + quantity);
    }
}
