import java.util.Scanner;

public class ATM {
    static Scanner sc = new Scanner(System.in);
    static int pin = 1234;
    static double balance = 10000;
    static String history = "";
    public static void main(String[] args) {
        int attempts = 3;
        while (attempts > 0) {
            System.out.print("Enter ATM PIN: ");
            int enteredPin = sc.nextInt();
            if (enteredPin == pin) {
                System.out.println("\nLogin Successful");
                int choice;
                do {
                    System.out.println("\n===== ATM MENU =====");
                    System.out.println("1. Balance Enquiry");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Mini Statement");
                    System.out.println("5. Change PIN");
                    System.out.println("6. Exit");
                    System.out.print("Enter Choice: ");
                    choice = sc.nextInt();
                    switch(choice) {
                        case 1:
                            balanceEnquiry();
                            break;

                        case 2:
                            withdraw();
                            break;

                        case 3:
                            deposit();
                            break;

                        case 4:
                            miniStatement();
                            break;

                        case 5:
                            changePin();
                            break;

                        case 6:
                            System.out.println("Thank You...");
                            break;

                        default:
                            System.out.println("Invalid Choice");
                    }
                } while(choice != 6);

                break;
            }
            else {

                attempts--;

                if(attempts == 0) {
                    System.out.println("ATM Card Blocked");
                }
                else {
                    System.out.println("Wrong PIN");
                    System.out.println("Attempts Left : " + attempts);
                }

            }

        }

    }
    static void balanceEnquiry() {
        System.out.println("Current Balance : " + balance);
    }
    static void withdraw() {
        System.out.print("Enter Amount : ");
        double amount = sc.nextDouble();
        if(amount <= balance) {
            balance -= amount;
            history += "Withdraw : " + amount + "\n";
            System.out.println("Collect Cash");
            System.out.println("Remaining Balance : " + balance);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
    static void deposit() {
        System.out.print("Enter Amount : ");
        double amount = sc.nextDouble();
        balance += amount;
        history += "Deposit : " + amount + "\n";
        System.out.println("Amount Deposited Successfully");

    }
    static void miniStatement() {
        System.out.println("\n===== MINI STATEMENT =====");
        if(history.equals("")) {
            System.out.println("No Transactions");
        }
        else {
            System.out.println(history);
        }
        System.out.println("Current Balance : " + balance);

    }

    static void changePin() {

        System.out.print("Enter Old PIN: ");
        int oldPin = sc.nextInt();
        if(oldPin == pin) {
            System.out.print("Enter New PIN: ");
            pin = sc.nextInt();
            System.out.println("PIN Changed Successfully");
        }
        else {
            System.out.println("Incorrect Old PIN");

        }

    }

}