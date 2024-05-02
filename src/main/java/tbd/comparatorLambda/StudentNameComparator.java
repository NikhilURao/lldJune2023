package tbd.comparatorLambda;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        // if other.psp = this.psp return 0
        // if other.psp > this.psp return -ve
        // if other.psp < this.psp return +ve
        if (o1.name.equalsIgnoreCase(o2.name)) return 0;
        else if (o1.name.compareTo(o2.name) < 0 ) return -1;
        else return 1;
    }
}
