package defaultconstructors;

public class Student {
    String name;
    private int age;
    String univName;
    double psp;
    boolean isPlaced;

    // no user defined constructor -> default constructor provided by Java's Object class

    // constructors without parameters
    Student() {
        this.psp = 100.0;
        isPlaced = false;
    }

    // parameterised constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        psp = 100.0;
        isPlaced = false;
    }

    Student(String name, int age, String univ) {
        this.name = name;
        this.age = age;
        this.univName = univ;
        psp = 100.0;
        isPlaced = false;
    }



}
