package practice.oopconcepts;

public class Child2 extends Parent {
    public Child2(String name, String caste) {
        //Calling Parent Constructor Should be first statement in Child Constructor.
        super(name, caste);
        System.out.println("Calling Parent Constructor");
    }

    @Override
    public void printInformation() {
        System.out.println("Child2 Overriding Parent printInformation()");
        super.printInformation();
    }

    public void printInformationChild2() {
        System.out.println("printInformationChild2");
        super.printInformation();
    }
}
