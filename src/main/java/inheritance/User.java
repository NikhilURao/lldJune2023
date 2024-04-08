package inheritance;

public class User {
    String username;
    private String password;

    void login() {
        System.out.println("User is logging in");
    }

    void changePassword(User u, String newPassword) {
        u.password = newPassword;
    }
}
