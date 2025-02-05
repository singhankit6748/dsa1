
import java.util.Scanner;

public class atmpin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String CorrectPin = "4215";
        String enteredPin;
        int attempts = 0;
        final int maxAttempts = 3;
        while (attempts < maxAttempts) {
            System.out.println("Enter your atm pin:");
            enteredPin = sc.nextLine();
            if (enteredPin.equals(CorrectPin)) {
                System.out.println("Pin Verified !Access Granted");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect pin" + (maxAttempts - attempts) + "attempts");
            }
            if (attempts == maxAttempts) {
                System.out.println("maximum attempts exceeds please try again later");
            }

        }
    }
}
