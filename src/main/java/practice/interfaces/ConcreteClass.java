package practice.interfaces;

public class ConcreteClass implements Interface1, Interface2 {

    public static void main(String[] args) {
//        ConcreteClass concreteClass = new ConcreteClass();
//        concreteClass.print();
//        MyEnum day = MyEnum.FRIDAY;
//        System.out.println(day);
        System.out.println("final Result " + getResult(2,0));
    }

    @Override
    public void print() {
        Interface1.super.print();
        Interface2.super.print();
    }

    public static int getResult(int a, int b) {
        int result = 0;
        try {
            result = a/b;
            System.out.println("Result " + result);
            return result;
        } catch (Exception e) {
            System.out.println("Exception " + e);
        } finally {
            result = 0;
            System.out.println("finally");
        }
        System.out.println("returning 0");
        return result;
    }
}
