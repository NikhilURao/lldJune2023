package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("HS");
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(1);
        s.add(7);
        s.add(0);
        s.add(21);
        s.add(65);

        for (Integer i : s){
            System.out.println(i);
        }
        System.out.println("LHS");
        Set<Integer> s1 = new LinkedHashSet<>();
        s1.add(10);
        s1.add(1);
        s1.add(7);
        s1.add(0);
        s1.add(21);
        s1.add(65);

        for (Integer i : s1){
            System.out.println(i);
        }

        System.out.println("TS");
        Set<Integer> s2 = new TreeSet<>();
        s2.add(10);
        s2.add(1);
        s2.add(7);
        s2.add(0);
        s2.add(21);
        s2.add(65);

        for (Integer i : s2){
            System.out.println(i);
        }

        LinkedList<Status> sn = new LinkedList<>();
        Set<Status> ses = EnumSet.allOf(Status.class);

        for (Status sta : ses.stream().toList()) {
            System.out.println(sta);
        }

        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("Nikhil");
        q.add("Mg");
        q.add("Raju");
        q.add("Surya");
        q.add("Ajay");

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.poll();
        }

        ArrayList<Student> stu = new ArrayList<>();
        stu.add(new Student("Nik", 90, 23));
        stu.add(new Student("MG", 95, 21));
        stu.add(new Student("Raju", 70, 25));

        Collections.sort(stu);

        System.out.println("Sorted by psp");

        Collections.sort(stu, new StudentNameComparator());

        System.out.println("Sorted by name");

        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "One");
        tm.put(2, "Two");

        NavigableMap<Integer, String> tm1 =tm.descendingMap();

        System.out.println("");






    }
}
