package practice.oopconcepts;

public class Child1 extends Parent {
    public Child1(String name, String caste) {
        //Calling Parent Constructor Should be first statement in Child Constructor.
        super(name, caste);
        System.out.println("Calling Parent Constructor");
    }

    @Override
    public void printInformation() {
        System.out.println("Child1 Overriding Parent printInformation()");
        super.printInformation();
    }

    public void printInformationChild1(){
        System.out.println("printInformationChild1");
        super.printInformation();
    }

    // printInformation() is already defined in this class so we can't
    //create new method with same method signature (name and parameters)
    //public String printInformation() {
    //    return null;
    //}
}
