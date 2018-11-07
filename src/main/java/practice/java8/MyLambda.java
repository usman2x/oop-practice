package practice.java8;

import java.util.HashMap;

public class MyLambda {
    private String gName = "G Usman";
    private int count = 5;
    public HashMap<String , String> map = new HashMap<>();

    public interface Greetings {
        void sayMessage(String message);
    }

    private void message(HashMap<String , String> map) {
        String name;
        Greetings greetings = message -> {
            map.put("f","fd");
            int a = 0;
            String g = "";
            gName = "Usman G";
            count = 6;
//            name = "Usman";
            System.out.println(message + gName);
        };
        greetings.sayMessage("Hello ");
    }

    public static void main(String[] args) {
        MyLambda myLambda = new MyLambda();
//        myLambda.message();
    }
}
