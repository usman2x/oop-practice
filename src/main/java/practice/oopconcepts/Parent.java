package practice.oopconcepts;

public abstract class Parent {
    private String name;
    private String caste;

    public Parent(String name, String caste) {
        this.name = name;
        this.caste = caste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", caste='" + caste + '\'' +
                '}';
    }

    public void printInformation() {
        System.out.println(toString());
    }
}
