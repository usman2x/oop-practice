package practice.constants;


import practice.model.MyNode;

public enum MyEnum{
    SUNDAY("Sunday"), MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    public String dayName;
    MyEnum(String dayName){
        this.dayName = dayName;
    }
    MyEnum(){
    }
//    public abstract String myAbstract();
}
