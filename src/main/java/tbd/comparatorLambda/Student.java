package tbd.comparatorLambda;

public class Student implements Comparable<Student>{
    String name;

    long psp;

    int age;

    Student(String name, long psp, int age) {
        this.name = name;
        this.psp = psp;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        // if other.psp = this.psp return 0
        // if other.psp > this.psp return -ve
        // if other.psp < this.psp return +ve
        if (other.psp == this.psp) return 0;
        else if (other.psp > this.psp) return -1;
        else return 1;
    }
}
