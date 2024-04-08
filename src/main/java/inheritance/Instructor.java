package inheritance;

public class Instructor extends User {
    // username, password, login()
    String batchName;
    double averageRating;

    void scheduleClass() {
        System.out.println("Scheduling a class");
    }

    public static void main(String[] args) {
        Instructor i = new Instructor();
    }
}
