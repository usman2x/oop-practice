package practice.oopconcepts;

public class OopConceptApp {
    public static void main(String[] args) {
        OopConceptApp oopConceptApp = new OopConceptApp();
        oopConceptApp.showCastingProblem();
    }

    private void showCastingProblem() {
        //Implicit Up-casting
        Parent child1 = new Child1("Usman", "Arain");
        child1.printInformation();

        Child2 child2 = new Child2("Talha", "Arain");
        //Explicit Up-Casting
        //Parent are not able to call
        //the local methods of Child class
        Parent child = child2;
        child.printInformation();
        //This will create compile time error
        //You need to define or declare this method in
        //parent class to call from parent's reference
        //child.printInformationChild2();

        Child2 childTwo = (Child2) child;
        childTwo.printInformationChild2();

        //Auto Boxing
        Integer autoBoxingInteger = 10;
        //Un Boxing
        int unboxingInteger = autoBoxingInteger;
    }
}
