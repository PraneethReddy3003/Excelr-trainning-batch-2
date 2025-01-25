import java.util.Scanner;

public class CharacterCaseChecker {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); // Read the first character from input

        // Check if the character is lowercase or uppercase
        if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase letter.");
        } else if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter.");
        } else {
            System.out.println(ch + " is not a letter.");
        }

        // Close the scanner
        scanner.close();
    }
}
