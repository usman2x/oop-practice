package practice.interfaces;

public interface Interface1 extends MyInterface {
    default void print() {
        System.out.println("Child1");
    }
}
