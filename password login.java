import java.util.Scanner;
import java.io.Console;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Console con = System.console();
        if (con == null) {
            System.out.println("Run the program in Command Prompt.");
            return;
        }
        System.out.print("Enter number of users: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] username = new String[n];
        String[] password = new String[n];
        
        System.out.println("\nSignup");
        for (int i = 0; i < n; i++) {

            System.out.print("Enter Username: ");
            username[i] = sc.nextLine();
            char[] pass = con.readPassword("Enter Password: ");
            String p = new String(pass);
            String enc = "";
            for (int j = 0; j < p.length(); j++) {
                enc = enc + (char)(p.charAt(j) + 2);
            }
            password[i] = enc;
        }
        System.out.println("\nLogin");

        System.out.print("Username: ");
        String user = sc.nextLine();

        char[] loginPass = con.readPassword("Password: ");
        String p = new String(loginPass);

        String encPass = "";

        for (int i = 0; i < p.length(); i++) {
            encPass = encPass + (char)(p.charAt(i) + 2);
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (username[i].equals(user) && password[i].equals(encPass)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Username or Password");
        }
    }
}