/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package calculator;

import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create  scanner object for user input
        while (true) { // loop to keep the calculator running
            clearScreen(); // Clear the screen 
            displayMenu(); // Display menu
            System.out.print("Enter choice (1-26): "); // ask user for choice
            int choice = scanner.nextInt(); // Read user's choice

            if (choice == 26) { // Check if the user wants to exit
                System.out.println("Exiting the program."); // Inform user about exiting
                break; // Break the loop to exit
            }

            clearScreen(); // Clear the screen before displaying the result

            switch (choice) { // Switch based on user's choice
                case 1:
                    System.out.print("Enter first number: "); // Prompt for first number
                    double num1 = scanner.nextDouble(); // Read first number
                    System.out.print("Enter second number: "); // Prompt for second number
                    double num2 = scanner.nextDouble(); // Read second number
                    System.out.println("Result: " + add(num1, num2)); // Display result of addition
                    break;
                case 2:
                    System.out.print("Enter first number: "); // Prompt for first number
                    num1 = scanner.nextDouble(); // Read first number
                    System.out.print("Enter second number: "); // Prompt for second number
                    num2 = scanner.nextDouble(); // Read second number
                    System.out.println("Result: " + subtract(num1, num2)); // Display result of subtraction
                    break;
                case 3:
                    System.out.print("Enter first number: "); // Prompt for first number
                    num1 = scanner.nextDouble(); // Read first number
                    System.out.print("Enter second number: "); // Prompt for second number
                    num2 = scanner.nextDouble(); // Read second number
                    System.out.println("Result: " + multiply(num1, num2)); // Display result of multiplication
                    break;
                case 4:
                    System.out.print("Enter first number: "); // Prompt for first number
                    num1 = scanner.nextDouble(); // Read first number
                    System.out.print("Enter second number: "); // Prompt for second number
                    num2 = scanner.nextDouble(); // Read second number
                    if (num2 != 0) { // Check if second number is not zero
                        System.out.println("Result: " + divide(num1, num2)); // Display result of division
                    } else {
                        System.out.println("Error! Division by zero."); // Display error message
                    }
                    break;
                case 5:
                    System.out.print("Enter base: "); // Prompt for base
                    num1 = scanner.nextDouble(); // Read base
                    System.out.print("Enter exponent: "); // Prompt for exponent
                    num2 = scanner.nextDouble(); // Read exponent
                    System.out.println("Result: " + Math.pow(num1, num2)); // Display result of power
                    break;
                case 6:
                    System.out.print("Enter number: "); // Prompt for number
                    num1 = scanner.nextDouble(); // Read number
                    System.out.println("Result: " + square(num1)); // Display result of square
                    break;
                case 7:
                    System.out.print("Enter number: "); // Prompt for number
                    num1 = scanner.nextDouble(); // Read number
                    System.out.println("Result: " + cube(num1)); // Display result of cube
                    break;
                case 8:
                    System.out.print("Enter number: "); // Prompt for number
                    num1 = scanner.nextDouble(); // Read number
                    System.out.println("Result: " + Math.sqrt(num1)); // Display result of square root
                    break;
                case 9:
                    System.out.print("Enter number: "); // Prompt for number
                    num1 = scanner.nextDouble(); // Read number
                    System.out.println("Result: " + Math.round(num1)); // Display result of round
                    break;
                case 10:
                    System.out.print("Enter number: "); // Prompt for number
                    num1 = scanner.nextDouble(); // Read number
                    System.out.println("Result: " + Math.ceil(num1)); // Display result of ceiling
                    break;
                case 11:
                    System.out.print("Enter number: "); // Prompt for number
                    num1 = scanner.nextDouble(); // Read number
                    System.out.println("Result: " + Math.floor(num1)); // Display result of floor
                    break;
                case 12:
                    System.out.print("Enter first number: "); // Prompt for first number
                    num1 = scanner.nextDouble(); // Read first number
                    System.out.print("Enter second number: "); // Prompt for second number
                    num2 = scanner.nextDouble(); // Read second number
                    System.out.println("Result: " + Math.min(num1, num2)); // Display minimum value
                    break;
                case 13:
                    System.out.print("Enter first number: "); // Prompt for first number
                    num1 = scanner.nextDouble(); // Read first number
                    System.out.print("Enter second number: "); // Prompt for second number
                    num2 = scanner.nextDouble(); // Read second number
                    System.out.println("Result: " + Math.max(num1, num2)); // Display maximum value
                    break;
                case 14:
                    System.out.print("Enter angle in degrees: "); // Prompt for angle in degrees
                    num1 = scanner.nextDouble(); // Read angle
                    System.out.println("Result: " + Math.sin(Math.toRadians(num1))); // Display sine value
                    break;
                case 15:
                    System.out.print("Enter angle in degrees: "); // Prompt for angle in degrees
                    num1 = scanner.nextDouble(); // Read angle
                    System.out.println("Result: " + Math.cos(Math.toRadians(num1))); // Display cosine value
                    break;
                case 16:
                    System.out.print("Enter value (-1 to 1): "); // Prompt for value
                    num1 = scanner.nextDouble(); // Read value
                    System.out.println("Result: " + Math.asin(num1)); // Display arc sine value
                    break;
                case 17:
                    System.out.print("Enter value (-1 to 1): "); // Prompt for value
                    num1 = scanner.nextDouble(); // Read value
                    System.out.println("Result: " + Math.acos(num1)); // Display arc cosine value
                    break;
                case 18:
                    System.out.print("Enter value: "); // Prompt for value
                    num1 = scanner.nextDouble(); // Read value
                    System.out.println("Result: " + Math.atan(num1)); // Display arc tangent value
                    break;
                case 19:
                    System.out.print("Enter number: "); // Prompt for number
                    num1 = scanner.nextDouble(); // Read number
                    System.out.println("Result: " + Math.exp(num1)); // Display exponential value
                    break;
                case 20:
                    System.out.print("Enter a number: "); // Prompt for number
                    int intNum = scanner.nextInt(); // Read number
                    System.out.println("Is palindrome: " + isPalindrome(intNum)); // Display if number is palindrome
                    break;
                case 21:
                    System.out.print("Enter a number: "); // Prompt for number
                    intNum = scanner.nextInt(); // Read number
                    System.out.println("Is Armstrong: " + isArmstrong(intNum)); // Display if number is Armstrong number
                    break;
                case 22:
                    System.out.print("Enter a number: "); // Prompt for number
                    intNum = scanner.nextInt(); // Read number
                    System.out.println("Is prime: " + isPrime(intNum)); // Display if number is prime
                    break;
                case 23:
                    System.out.print("Enter the number of entries: "); // Prompt for number of entries
                    int count = scanner.nextInt(); // Read number of entries
                    double[] numbers = new double[count]; // Create array to store numbers
                    for (int i = 0; i < count; i++) { // Loop to read each number
                        System.out.print("Enter number " + (i + 1) + ": "); // Prompt for each number
                        numbers[i] = scanner.nextDouble(); // Read each number
                    }
                    System.out.println("Average: " + calculateAverage(numbers)); // Display average
                    break;
                case 24:
                    System.out.print("Enter first number: "); // Prompt for first number
                    num1 = scanner.nextDouble(); // Read first number
                    System.out.print("Enter second number: "); // Prompt for second number
                    num2 = scanner.nextDouble(); // Read second number
                    System.out.println("GCD: " + gcd(num1, num2)); // Display GCD
                    break;
                case 25:
                    System.out.print("Enter first number: "); // Prompt for first number
                    num1 = scanner.nextDouble(); // Read first number
                    System.out.print("Enter second number: "); // Prompt for second number
                    num2 = scanner.nextDouble(); // Read second number
                    System.out.println("LCM: " + lcm(num1, num2)); // Display LCM
                    break;
                default:
                    System.out.println("Invalid choice! Please try again."); // Display error for invalid choice
                    break;
            }

            System.out.print("\nPress Enter to continue..."); // Prompt to press Enter to continue
            scanner.nextLine(); // Consume newline left-over
            scanner.nextLine(); // Wait for user to press Enter
        }
        scanner.close(); // Close the scanner
    }

    public static void displayMenu() {
        System.out.println("\nSelect operation:"); // Display menu options
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Power");
        System.out.println("6. Square");
        System.out.println("7. Cube");
        System.out.println("8. Square root");
        System.out.println("9. Round");
        System.out.println("10. Ceiling");
        System.out.println("11. Floor");
        System.out.println("12. Min Value");
        System.out.println("13. Max Value");
        System.out.println("14. Sine");
        System.out.println("15. Cosine");
        System.out.println("16. Arc Sine");
        System.out.println("17. Arc Cosine");
        System.out.println("18. Arc Tangent");
        System.out.println("19. Exponential");
        System.out.println("20. Check Palindrome");
        System.out.println("21. Check Armstrong Number");
        System.out.println("22. Check Prime Number");
        System.out.println("23. Calculate Average");
        System.out.println("24. GCD");
        System.out.println("25. LCM");
        System.out.println("26. Exit");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J"); // ANSI escape codes to clear the console
        System.out.flush(); // Flush the output stream
    }

    public static double add(double a, double b) {
        return a + b; // Return sum of two numbers
    }

    public static double subtract(double a, double b) {
        return a - b; // Return difference of two numbers
    }

    public static double multiply(double a, double b) {
        return a * b; // Return product of two numbers
    }

    public static double divide(double a, double b) {
        return a / b; // Return quotient of two numbers
    }

    public static double square(double a) {
        return a * a; // Return square of a number
    }

    public static double cube(double a) {
        return a * a * a; // Return cube of a number
    }

    public static boolean isPalindrome(int number) {
        int reversed = 0, original = number, remainder; // Initialize variables
        while (number != 0) { // Loop to reverse the number
            remainder = number % 10; // Get last digit
            reversed = reversed * 10 + remainder; // Append digit to reversed number
            number /= 10; // Remove last digit from number
        }
        return original == reversed; // Check if original number is equal to reversed number
    }

    public static boolean isArmstrong(int number) {
        int original = number, remainder, result = 0, n = 0; // Initialize variables
        while (original != 0) { // Loop to count digits
            original /= 10; // Remove last digit from original number
            ++n; // Increment digit count
        }
        original = number; // Reset original to number
        while (original != 0) { // Loop to calculate sum of powers of digits
            remainder = original % 10; // Get last digit
            result += Math.pow(remainder, n); // Add power of digit to result
            original /= 10; // Remove last digit from original number
        }
        return result == number; // Check if result is equal to original number
    }

    public static boolean isPrime(int number) {
        if (number <= 1) { // Check if number is less than or equal to 1
            return false; // Return false for non-prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // Loop to check divisibility
            if (number % i == 0) { // Check if number is divisible by i
                return false; // Return false if number is divisible by i
            }
        }
        return true; // Return true for prime numbers
    }

    public static double calculateAverage(double[] numbers) {
        double sum = 0; // Initialize sum
        for (double number : numbers) { // Loop through numbers
            sum += number; // Add each number to sum
        }
        return sum / numbers.length; // Return average
    }

    public static double gcd(double a, double b) {
        while (b != 0) { // Loop until b is zero
            double temp = b; // Store b in temp
            b = a % b; // Set b to remainder of a divided by b
            a = temp; // Set a to temp
        }
        return a; // Return GCD
    }

    public static double lcm(double a, double b) {
        return (a * b) / gcd(a, b); // Return LCM
    }
}

