import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CORRECT_PIN = 1234;
        int userPin;
        double balance = 5000000.0;
        double amount;
        char choice;
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;
        do 
        {
            System.out.print("Enter your PIN: ");
            userPin = scanner.nextInt();
            attempts++;
            if (userPin == CORRECT_PIN) 
            {
                System.out.println("PIN verified successfully. Welcome!");
                break;
            } 
            else 
            {
                System.out.println("Incorrect PIN. Attempts left: " + (MAX_ATTEMPTS - attempts));
            }
            if (attempts == MAX_ATTEMPTS) 
            {
                System.out.println("Too many incorrect attempts. Access denied.");
                scanner.close();
                return;
            }
        } 
        while (attempts < MAX_ATTEMPTS);
        do 
        {
            System.out.println("\nCurrent Balance: " + balance);
            System.out.print("Enter withdrawal amount: ");
            amount = scanner.nextDouble();
            if (amount > balance) 
            {
                System.out.println("Insufficient funds! Please enter a valid amount.");
            } 
            else if (amount <= 0) 
            {
                System.out.println("Invalid amount! Please enter a positive value.");
            } 
            else 
            {
                balance -= amount;
                System.out.println("Withdrawal successful! Remaining Balance: " + balance);
            }
            if (balance == 0) 
            {
                System.out.println("No balance left. Exiting system.");
                break;
            }
            System.out.print("Do you want to make another transaction? (y/n): ");
            choice = scanner.next().charAt(0);
        } 
        while (choice == 'y' || choice == 'Y');
        System.out.println("Thank you for using our ATM. Have a great day!");
        scanner.close();
    }
}