package practice.java8;

import practice.interfaces.MyInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Usman");
        list.add("Ali");
        list.add("Naveed");
        list.forEach(System.out::println);
    }
}
