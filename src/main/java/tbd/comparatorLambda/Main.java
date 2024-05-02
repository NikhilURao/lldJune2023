package tbd.comparatorLambda;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> stu = new ArrayList<>();
        stu.add(new Student("Nik", 90, 23));
        stu.add(new Student("MG", 95, 21));
        stu.add(new Student("Raju", 70, 25));

        Collections.sort(stu);

        System.out.println("Sorted by psp");

        // Collections.sort(stu, new StudentNameComparator());

        Comparator<Student> sncs = (o1, o2) -> {
            if (o1.name.equalsIgnoreCase(o2.name)) return 0;
            else if (o1.name.compareTo(o2.name) < 0 ) return -1;
            else return 1;
        };

        Collections.sort(stu, sncs);

        System.out.println("Sorted by name");






    }
}
