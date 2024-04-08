package inheritance;

public class Client {

    public static void main(String[] args) {
        User u = new User();
        Instructor i = new Instructor();

        u.changePassword(i, "");

        String instructorUsername = i.username;
        i.login(); //
        u.login(); //

//        u.scheduleClass();

        //System.out.println(i.username);

        NSDCA scaler = new Scaler();
    }
}
