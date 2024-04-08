package defaultconstructors;


public class Client {

    public static void main(String[] args) {
        Student rohan = new Student();
        Student chirag = new Student("Chirag", 26);
        Student nikhil = new Student("Nikhil", 26, "VTU");
        System.out.println(rohan.isPlaced); // default value for boolean
        System.out.println("DEBUG");
    }
}
