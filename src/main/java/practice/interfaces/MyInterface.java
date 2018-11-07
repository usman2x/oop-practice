package practice.interfaces;

public interface MyInterface {
    default void print() {
        System.out.println("Parent");
    }
}
