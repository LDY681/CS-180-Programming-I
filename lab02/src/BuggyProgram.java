import java.util.Scanner;

/**
 * This is a buggy program, please fix it.
 *
 * @author Your Name, youremail@purdue.edu
 */
public class BuggyProgram {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner s = new Scanner(System.in);

        // Welcome user with terminal
        System.out.println("Welcome to BuggyProgram!");

        // print a request for a name via the terminal
        System.out.println("Please enter your name: ");

        // read the string from the terminal
        String userName = s.nextLine();

        // print a request for a major via the terminal
        System.out.println("Please enter your current major: ");

        // read the string from the terminal
        String userMajor = s.nextLine();

        // request and read a phone number
        System.out.println("Please enter your phone number: ");
        String userPhoneNumber = s.nextLine();

        // request and read an email
        System.out.println("Enter your email address: ");
        String userEmail = s.nextLine();

        // call createBusinessCard() to generate a business card with user info
        createBusinessCard(userName, userMajor, userEmail, userPhoneNumber);

        s.close();

    }

    public static void createBusinessCard(String name, String major,
                                          String email, String phone) {
        System.out
                .print("Business Card\n------------------------------------------------\n"
                        + name
                        + "\nMajor: "
                        + major
                        + "\nPhone: "
                        + phone
                        + "\nEmail: "
                        + email
                        + "\n------------------------------------------------\n");
    }
}