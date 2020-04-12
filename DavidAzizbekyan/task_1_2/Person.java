package task_1_2;

public class Person {
    String name;
    boolean isMale;
    String surname;

    public boolean isMale() {
        return isMale;
    }

    public Person(String name, boolean isMale) {
        this.name = name;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }
}
