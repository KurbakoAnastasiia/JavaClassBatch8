package Class14;

public class Task {
    public static void main(String[] args) {


        String username = "Anastasiia";
        String password = "Ana1278903";

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password cannot be empty");
        } if (password.length() < 8) {
            System.out.println("Password is too short");
        } if (password.contains(username)) {
            System.out.println("Password cannot contain username");
        } if (!password.equals("Ana1278903")) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }

     }
}
