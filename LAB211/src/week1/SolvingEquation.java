package week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolvingEquation {
    private Scanner scanner;

    public SolvingEquation() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    calculateSuperlativeEquation();
                    break;
                case 2:
                    calculateQuadraticEquation();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private void calculateSuperlativeEquation() {
        System.out.print("Enter coefficient A: ");
        double a = validateInput();

        System.out.print("Enter coefficient B: ");
        double b = validateInput();

        // Calculate the solution x
        double x = -b / a;
        System.out.println("Solution x: " + x);

        // Find and display even, odd, and square numbers
        List<Double> coefficients = new ArrayList<>();
        coefficients.add(a);
        coefficients.add(b);
        displayResults(coefficients);
    }

    private void calculateQuadraticEquation() {
        System.out.print("Enter coefficient A: ");
        double a = validateInput();

        System.out.print("Enter coefficient B: ");
        double b = validateInput();

        System.out.print("Enter coefficient C: ");
        double c = validateInput();

        // Calculate the solutions x1 and x2 using the quadratic formula
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("No real solutions.");
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Solutions: x1 = " + x1 + ", x2 = " + x2);
        }

        // Find and display even, odd, and square numbers
        List<Double> coefficients = new ArrayList<>();
        coefficients.add(a);
        coefficients.add(b);
        coefficients.add(c);
        displayResults(coefficients);
    }

    private double validateInput() {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.next(); 
            }
        }
    }

    private void displayResults(List<Double> coefficients) {
        List<Double> oddNumbers = new ArrayList<>();
        List<Double> evenNumbers = new ArrayList<>();
        List<Double> squareNumbers = new ArrayList<>();

        for (double num : coefficients) {
          
            if (num % 1 == 0) { 
                int intNum = (int) num;
                if (intNum % 2 == 0) {
                    evenNumbers.add(num);
                } else {
                    oddNumbers.add(num);
                }

        
                if (isPerfectSquare(intNum)) {
                    squareNumbers.add(num);
                }
            }
        }

        // Print results
        System.out.println("Odd numbers: " + oddNumbers);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Square numbers: " + squareNumbers);
    }

    private boolean isPerfectSquare(int number) {
        if (number < 0) return false; // Negative numbers are not perfect squares
        int sqrt = (int) Math.sqrt(number);
        return (sqrt * sqrt == number);
    }
}