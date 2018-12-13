package practice.interfaces;

public class ListSetImpl implements IList<String>, ISet<String> {
    @Override
    public void add(String a) {
        System.out.println("Adding Element");
    }

    @Override
    public String get(int i) {
        return null;
    }
}
