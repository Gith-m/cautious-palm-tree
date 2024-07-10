package calculator;

import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Enter choice (1-26): ");
            int choice = scanner.nextInt();

            if (choice == 26) {
                System.out.println("Exiting the program.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Result: " + divide(num1, num2));
                    } else {
                        System.out.println("Error! Division by zero.");
                    }
                    break;
                case 5:
                    System.out.print("Enter base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Math.pow(num1, num2));
                    break;
                case 6:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + square(num1));
                    break;
                case 7:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + cube(num1));
                    break;
                case 8:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.sqrt(num1));
                    break;
                case 9:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.round(num1));
                    break;
                case 10:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.ceil(num1));
                    break;
                case 11:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.floor(num1));
                    break;
                case 12:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Math.min(num1, num2));
                    break;
                case 13:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Math.max(num1, num2));
                    break;
                case 14:
                    System.out.print("Enter angle in degrees: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.sin(Math.toRadians(num1)));
                    break;
                case 15:
                    System.out.print("Enter angle in degrees: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.cos(Math.toRadians(num1)));
                    break;
                case 16:
                    System.out.print("Enter value (-1 to 1): ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.asin(num1));
                    break;
                case 17:
                    System.out.print("Enter value (-1 to 1): ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.acos(num1));
                    break;
                case 18:
                    System.out.print("Enter value: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.atan(num1));
                    break;
                case 19:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.exp(num1));
                    break;
                case 20:
                    System.out.print("Enter a number: ");
                    int intNum = scanner.nextInt();
                    System.out.println("Is palindrome: " + isPalindrome(intNum));
                    break;
                case 21:
                    System.out.print("Enter a number: ");
                    intNum = scanner.nextInt();
                    System.out.println("Is Armstrong: " + isArmstrong(intNum));
                    break;
                case 22:
                    System.out.print("Enter a number: ");
                    intNum = scanner.nextInt();
                    System.out.println("Is prime: " + isPrime(intNum));
                    break;
                case 23:
                    System.out.print("Enter the number of entries: ");
                    int count = scanner.nextInt();
                    double[] numbers = new double[count];
                    for (int i = 0; i < count; i++) {
                        System.out.print("Enter number " + (i + 1) + ": ");
                        numbers[i] = scanner.nextDouble();
                    }
                    System.out.println("Average: " + calculateAverage(numbers));
                    break;
                case 24:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("GCD: " + gcd(num1, num2));
                    break;
                case 25:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("LCM: " + lcm(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
        scanner.close();
    }

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

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double square(double a) {
        return a * a;
    }

    public static double cube(double a) {
        return a * a * a;
    }

    public static boolean isPalindrome(int number) {
        int reversed = 0, original = number, remainder;
        while (number != 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }
        return original == reversed;
    }

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
        return result == number;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateAverage(double[] numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static double gcd(double a, double b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static double lcm(double a, double b) {
        return (a * b) / gcd(a, b);
    }
}
