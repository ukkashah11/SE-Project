package SE_Project;

import java.util.List;
import java.util.Scanner;

public class LoginPage {


    private List<User> users;

    public LoginPage(List<User> users) {
        this.users = users;
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Login");
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.println("Login successful!");
                return;
            }
        }

        System.out.println("Invalid email or password. Please try again.");
    }

}
