package SE_Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SignupPage {
    private List<User> users;

    public SignupPage() {
        this.users = new ArrayList<>();
    }

    public void signUp() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sign Up");
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        User user = new User(email, password, phoneNumber);
        users.add(user);

        System.out.println("Sign up successful!");
    }

    public List<User> getUsers() {
        return users;
    }

}
