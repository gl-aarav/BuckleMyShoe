/* 
 * Aarav Goyl
 * 10/29/24
 * BuckleMyShoe.java
 * 
 * This program prompts the user to enter an integer between 1 and 10 (inclusive) 
 * and uses conditional statements to determine and print the corresponding line 
 * from the nursery rhyme "Buckle My Shoe." 
 * 
 * Working on: if-else statements for conditional logic.
 * Testing: The program is designed to accept only integers from 1 to 10. Any input 
 * outside this range will result in an error message.
 * 
 * Pseudocode:
 * FV - line
 * 
 * main: Initializes the program by creating an instance of the BuckleMyShoe class 
 * and calls the findIt method.
 * 
 * findIt: 
 * - Declares a variable of type byte to store user input.
 * - Calls getInput to retrieve the user's input.
 * - Calls decideWhich to determine the corresponding line based on input.
 * - Calls print to display the result.
 * 
 * getInput: 
 * - Welcomes the user and prompts for input.
 * - Initializes a Scanner for input reading.
 * - Returns the user's input as a byte.
 * 
 * decideWhich: 
 * - Accepts a byte parameter representing the user's input.
 * - Uses if-else statements to determine which line to assign based on the input.
 * - Stores the resulting line in the instance variable 'line'.
 * 
 * print: 
 * - Outputs the selected line or error message to the console.
 */

import java.util.Scanner; // Import the Scanner class for user input

public class BuckleMyShoe {
    private String line; // Instance variable to store the selected line from the rhyme
    
    // Constructor initializes the line variable
    public BuckleMyShoe() {
        line = new String(""); // Initializes line to an empty string
    }

    // Main method to start the program
    public static void main(String[] args) {
        BuckleMyShoe bms = new BuckleMyShoe(); // Create an instance of BuckleMyShoe
        bms.findIt(); // Call the method to process user input
    }

    // Method to find and print the corresponding line based on user input
    public void findIt() {
        byte var = getInput(); // Get user input
        decideWhich(var); // Determine the corresponding line
        print(); // Print the line
    }

    // Method to prompt user for input and return it
    public byte getInput() {
        Scanner in = new Scanner(System.in); // Initialize Scanner for input
        System.out.print("\n\n\n\t\t\t Welcome to Buckle My Shoe!\nEnter a number from 1-10: ");
        return in.nextByte(); // Read and return user input as byte
    }

    // Method to decide which line corresponds to the input number
    public void decideWhich(byte num) {
        // Conditional statements to set the line based on input
        if (num == 1 || num == 2) {
            line = "1, 2, Buckle my shoe";
        } else if (num == 3 || num == 4) {
            line = "3, 4, Shut the door";
        } else if (num == 5 || num == 6) {
            line = "5, 6, pick up sticks";
        } else if (num == 7 || num == 8) {
            line = "7, 8, Lay them straight";
        } else if (num == 9 || num == 10) {
            line = "9, 10, Big fat hen";
        } else {
            line = "You did not enter a valid input"; // Error message for invalid input
        }
    }

    // Method to print the selected line
    public void print() {
        System.out.println(line + "\n\n\n"); // Output the line to the console
    }
}
