package constructors;

public class Client {

    public static void main(String[] args) {
        Student st = new Student("Naman", "ABC");

        System.out.println("DEBUG");

        Student st2 = new Student("Hello");
//        Student st1 = new Student();

        Student st3 = new Student(st2);


        st3.name = "Aman";


//        Student st4 = st3;
        System.out.println("DEBUG");

        // int, boolean, float
        // object, String, array
        int [] arr = new int[10];
        // [10,20,,,,,,,,] @2000
        int a =10;
        arr[0] = 10;
        arr[1] = 20;
        int [] arr1 = arr; // arr1 = @2000

        Student s1 = new Student();
        Student s2 = s1; // sallow copy
        s2 = new Student(s1); // deep copy
    }
}
