package week2;

import java.util.Scanner;

class Matrix {
    private int rows;
    private int columns;
    private double[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new double[rows][columns];
    }

    public void inputMatrix(Scanner scanner) {
        System.out.println("Enter values for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                while (true) {
                    System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                    if (scanner.hasNextDouble()) {
                        data[i][j] = scanner.nextDouble();
                        break;
                    } else {
                        System.out.println("Values of matrix must be a number.");
                        scanner.next(); // Clear the invalid input
                    }
                }
            }
        }
    }

    public Matrix additionMatrix(Matrix matrix2) {
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = this.data[i][j] + matrix2.data[i][j];
            }
        }
        return result;
    }

    public Matrix subtractionMatrix(Matrix matrix2) {
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = this.data[i][j] - matrix2.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiplicationMatrix(Matrix matrix2) {
        Matrix result = new Matrix(rows, matrix2.columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix2.columns; j++) {
                result.data[i][j] = 0;
                for (int k = 0; k < columns; k++) {
                    result.data[i][j] += this.data[i][k] * matrix2.data[k][j];
                }
            }
        }
        return result;
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}