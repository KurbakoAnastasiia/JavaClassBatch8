package Class14;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username, password, confirmedpassword;
        System.out.println("Please Enter username");
        username = scanner.nextLine();
        System.out.println("Plese Enter password");
        password = scanner.nextLine();
        System.out.println("Confirm password");
        confirmedpassword = scanner.nextLine();

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password cannot be empty");
        } else {
            if (password.length() < 8) {
                System.out.println("Password is too short");
            } else {
                if (password.contains(username)) {
                    System.out.println("Password cannot contain username");
                } else {
                    if (!password.equals(confirmedpassword)) {
                        System.out.println("Passwords do not match");
                    } else {
                        System.out.println("Your username and password has been created");
                    }
                }
            }
        }
    }
}
