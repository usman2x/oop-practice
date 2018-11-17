package practice.design.patterns.decorator;

public class App {
    public static void main(String[] args) {
        TissuePacking tissuePacking = new TissuePacking();
        tissuePacking.pack(tissuePacking.retrievePackageQuantity());

        BlackFridayDeal blackFridayDeal = new BlackFridayDeal();
        blackFridayDeal.setPackage(tissuePacking);
        blackFridayDeal.pack(blackFridayDeal.retrievePackageQuantity());
    }
}
