/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Test {
    public static void main(String[] args) {
        String[] options = {"Normal calculator", "Calculator BMI index", "Addition of matrices", "Subtraction of matrices",
                "Multiplication of matrices", "Shape calculations (Rectangle, Circle, Triangle)", "Exit"};

        Menu<String> menu = new Menu<String>("===== Main Menu =====", options) {
            @Override
            public void execute(int n) {
                Scanner scanner = new Scanner(System.in);
                switch (n) {
                    case 1:
                        Calculator.normalCalculator(scanner);
                        break;
                    case 2:
                        Calculator.calculateBMI(scanner);
                        break;
                    case 3:
                        performMatrixOperation(scanner, "Addition");
                        break;
                    case 4:
                        performMatrixOperation(scanner, "Subtraction");
                        break;
                    case 5:
                        performMatrixOperation(scanner, "Multiplication");
                        break;
                    case 6:
                        performShapeCalculations(scanner);
                        break;
                    case 7:
                        System.out.println("Exiting the program.");
                        System.exit(0);
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        };
        menu.run();
    }

    public static void performMatrixOperation(Scanner scanner, String operation) {
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        Matrix matrix1 = new Matrix(rows, columns);
        matrix1.inputMatrix(scanner);
        Matrix matrix2 = new Matrix(rows, columns);
        matrix2.inputMatrix(scanner);

        Matrix resultMatrix;
        switch (operation) {
            case "Addition":
                resultMatrix = matrix1.additionMatrix(matrix2);
                System.out.println("Result of Addition:");
                break;
            case "Subtraction":
                resultMatrix = matrix1.subtractionMatrix(matrix2);
                System.out.println("Result of Subtraction:");
                break;
            case "Multiplication":
                resultMatrix = matrix1.multiplicationMatrix(matrix2);
                System.out.println("Result of Multiplication:");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        resultMatrix.printMatrix();
    }

    public static void performShapeCalculations(Scanner scanner) {
        System.out.println("===== Shape Calculations =====");

        // Input for Rectangle
        System.out.print("Please input side width of Rectangle: ");
        double width = scanner.nextDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, length);

        // Input for Circle
        System.out.print("Please input radius of Circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        // Input for Triangle
        System.out.print("Please input side A of Triangle: ");
        double sideA = scanner.nextDouble();
        System.out.print("Please input side B of Triangle: ");
        double sideB = scanner.nextDouble();
        System.out.print("Please input side C of Triangle: ");
        double sideC = scanner.nextDouble();
        Triangle triangle = new Triangle(sideA, sideB, sideC);

        // Print results
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
    }
}