/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;
/**
 *
 * @author USER
 */
import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {
        
         // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Infinite loop to keep the calculator running
        while (true) { 
            // Displaying the menu options to the user
            displayMenu(); 
            System.out.print("Enter choice (1-26): ");
            // Get the user's choice
            int choice = scanner.nextInt(); 
            // If the user chooses 26, exit the program
            if (choice == 26) { 
                System.out.println("Exiting the program.");
                break;
            }
            // Switch case to handle different operations  based on user's choice
            switch (choice) { 
                case 1: // Addition
                    System.out.print("Enter first number: "); 
                    double num1 = scanner.nextDouble(); // Get the first number from the user
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble(); // Get the second number from the user
                    System.out.println("Result: " + add(num1, num2));
                    // Display the result of addition
                    break;
                case 2: // Subtraction
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble(); // Get the first number from the user
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble(); // Get the second number from the user
                    System.out.println("Result: " + subtract(num1, num2));
                    // Display the result of subtraction
                    break;
                case 3: // Multiplication
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble(); // Get the first number from the user
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble(); // Get the second number from the user
                    System.out.println("Result: " + multiply(num1, num2));
                    // Display the result of multiplication
                    break;
                case 4: // Division
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble(); // Get the first number from the user
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble(); // Get the second number from the user
                    
                    if (num2 != 0) { // Check if the second number is not zero to avoid division by zero error
                        System.out.println("Result: " + divide(num1, num2));
                    } else {
                        System.out.println("Error! Division by zero."); 
                        // Display an error message for division by zero
                    }
                    break;
                case 5: // Power
                    System.out.print("Enter base: ");
                    num1 = scanner.nextDouble(); // Get the base number from the user
                    System.out.print("Enter exponent: ");
                    num2 = scanner.nextDouble(); // Get the exponent number from the user
                    System.out.println("Result: " + Math.pow(num1, num2));
                    // Display the result of power calculation
                    break;
                case 6: // Square
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();  // Get the number from the user
                    System.out.println("Result: " + square(num1));
                    // Display the result of the squared number
                    break;
                case 7: // Cube
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble(); // Get the number from the user
                    System.out.println("Result: " + cube(num1));
                    // Display the result of cubing the number
                    break;
                case 8: // Square root
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble(); // Get the number from the user
                    System.out.println("Result: " + Math.sqrt(num1));
                    // Display the result of square root calculation
                    break;
                case 9: // Round
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble(); // Get the number from the user
                    System.out.println("Result: " + Math.round(num1)); // Display the result of rounding the number
                    break;
                case 10: // Ceiling
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble(); // Get the number from the user
                    System.out.println("Result: " + Math.ceil(num1)); // Display the result of ceiling function
                    break;
                case 11: // Floor
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble(); // Get the number from the user
                    System.out.println("Result: " + Math.floor(num1)); // Display the result of floor function
                    break;
                case 12: // Min Value
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble(); // Get the first number from the user
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble(); // Get the second number from the user
                    System.out.println("Result: " + Math.min(num1, num2)); // Display the minimum of the two numbers
                    break;
                case 13: // Max Value
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble(); // Get the first number from the user
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble(); // Get the second number from the user
                    System.out.println("Result: " + Math.max(num1, num2)); // Display the maximum of the two numbers
                    break;
                case 14: // Sine
                    System.out.print("Enter angle in degrees: ");
                    num1 = scanner.nextDouble(); // Get the angle in degrees from the user
                    System.out.println("Result: " + Math.sin(Math.toRadians(num1))); // Display the sine of the angle
                    break;
                case 15: // Cosine
                    System.out.print("Enter angle in degrees: ");
                    num1 = scanner.nextDouble(); // Get the angle in degrees from the user
                    System.out.println("Result: " + Math.cos(Math.toRadians(num1))); // Display the cosine of the angle
                    break;
                case 16: // Arc Sine
                    System.out.print("Enter value (-1 to 1): ");
                    num1 = scanner.nextDouble(); // Get the value from
                case 17: // Arc Cosine
                    System.out.print("Enter value (-1 to 1): ");
                    num1 = scanner.nextDouble(); // Get the value from user
                    System.out.println("Result: " + Math.acos(num1)); // Display the arc cosine of the value
                    break;
                case 18: // Arc Tangent
                    System.out.print("Enter value: ");
                    num1 = scanner.nextDouble(); // Get the value from user
                    System.out.println("Result: " + Math.atan(num1)); // Display the arc tangent of the value
                    break;
                case 19: // Exponential
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble(); // Get the number from user
                    System.out.println("Result: " + Math.exp(num1)); // Display the exponential of the number
                    break;
                case 20: // Check if a number is a palindrome
                    System.out.print("Enter a number: ");
                    int intNum = scanner.nextInt(); // Get the number from user
                    System.out.println("Is palindrome: " + isPalindrome(intNum)); // Check and display if the number is a palindrome
                    break;
                case 21: // Check if a number is an Armstrong number
                    System.out.print("Enter a number: ");
                    intNum = scanner.nextInt(); // Get the number from user
                    System.out.println("Is Armstrong: " + isArmstrong(intNum)); // Check and display if the number is an Armstrong number
                    break;
                case 22: // Check if a number is prime
                    System.out.print("Enter a number: ");
                    intNum = scanner.nextInt(); // Get the number from user
                    System.out.println("Is prime: " + isPrime(intNum)); // Check and display if the number is prime
                    break;
                case 23: // Calculate the average of a set of numbers
                    System.out.print("Enter the number of entries: ");
                    int count = scanner.nextInt(); // Get the number of entries from user
                    double[] numbers = new double[count]; // Create an array to hold the numbers
                    for (int i = 0; i < count; i++) {
                        System.out.print("Enter number " + (i + 1) + ": ");
                        numbers[i] = scanner.nextDouble(); // Get each number from user
                    }
                    System.out.println("Average: " + calculateAverage(numbers)); // Display the average of the numbers
                    break;
                case 24: // Calculate the Greatest Common Divisor (GCD)
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble(); // Get the first number from user
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble(); // Get the second number from user
                    System.out.println("GCD: " + gcd(num1, num2)); // Display the GCD of the numbers
                    break;
                case 25: // Calculate the Least Common Multiple (LCM)
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble(); // Get the first number from user
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble(); // Get the second number from user
                    System.out.println("LCM: " + lcm(num1, num2)); // Display the LCM of the numbers
                    break;
                default: // Handle invalid choices
                    System.out.println("Invalid choice! Please try again."); // Display error message for invalid choice
                    break;
            }
        }
        scanner.close(); // Close the scanner to free resources
    }

    // Method to display the menu options
    public static void displayMenu() {
        System.out.println("\nSelect operation:");
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

    // Basic arithmetic operations
    public static double add(double a, double b) {
        return a + b; // Return the sum of a and b
    }

    public static double subtract(double a, double b) {
        return a - b; // Return the difference of a and b
    }

    public static double multiply(double a, double b) {
        return a * b; // Return the product of a and b
    }

    public static double divide(double a, double b) {
        return a / b; // Return the quotient of a and b
    }

    public static double square(double a) {
        return a * a; // Return the square of a
    }

    public static double cube(double a) {
        return a * a * a; // Return the cube of a
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int reversed = 0, original = number, remainder;
        while (number != 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }
        return original == reversed; // Return true if the original number is equal to the reversed number
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int original = number, remainder, result = 0, n = 0;
        while (original != 0) {
            original /= 10;
            ++n;
        }
        original = number;
        while (original != 0) {
            remainder = original % 10;
            result += Math.pow(remainder, n);
            original /= 10;
        }
        return result == number; // Return true if the result is equal to the original number
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false; // Return false if the number is less than or equal to 1
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false; // Return false if the number is divisible by any number other than 1 and itself
        }
        return true; // Return true if the number is prime
    }

    // Method to calculate the average of an array of numbers
    public static double calculateAverage(double[] numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            sum += num; // Add each number to the sum
        }
        return sum / numbers.length; // Return the average
    }

    // Method to calculate the Greatest Common Divisor (GCD)
    public static double gcd(double a, double b) {
        while (b != 0) {
            double temp = b;
            b = a % b;
            a = temp;
        }
        return a; // Return the GCD of a and b
    }

    // Method to calculate the Least Common Multiple (LCM)
    public static double lcm(double a, double b) {
        return (a * b) / gcd(a, b); // Return the LCM of a and b
    }
}