package practice.interfaces;

public interface Interface2 extends MyInterface {
    default void print() {
        System.out.println("Child2");
    }
}
