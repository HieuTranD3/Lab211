package week2;

import java.util.Scanner;

public class Calculator {
    public static void normalCalculator(Scanner scanner) {
        double result = 0.0;
        System.out.println("Enter number: ");
        result = scanner.nextDouble();
        
        while (true) {
            System.out.println("Enter operator (+, -, *, /, ^, =): ");
            String operator = scanner.next();
            if (operator.equals("=")) {
                System.out.println("Result: " + result);
                break;
            }
            
            System.out.println("Enter number: ");
            double number = scanner.nextDouble();
            
            result = performOperation(result, number, operator);
        }
    }

    public static double performOperation(double result, double number, String operator) {
        switch (operator) {
            case "+":
                result += number;
                break;
            case "-":
                result -= number;
                break;
            case "*":
                result *= number;
                break;
            case "/":
                result /= number;
                break;
            case "^":
                result = Math.pow(result, number);
                break;
            default:
                System.out.println("Invalid operator. Please try again.");
        }
        return result;
    }

    public static void calculateBMI(Scanner scanner) {
        System.out.println("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.println("Enter height (m): ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
        displayBMIStatus(bmi);
    }

    public static void displayBMIStatus(double bmi) {
        if (bmi < 19) {
            System.out.println("Under-standard");
        } else if (bmi >= 19 && bmi < 25) {
            System.out.println("Standard");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi >= 30 && bmi < 40) {
            System.out.println("Fat - should lose weight");
        } else {
            System.out.println("Very fat - should lose weight immediately");
        }
    }
}