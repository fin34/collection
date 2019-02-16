package task206;

public class Student {

    private String name;
    private int pesel;

    public Student(String name, int pesel) {
        this.name = name;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public int getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", pesel=" + pesel +
                '}';
    }
}
