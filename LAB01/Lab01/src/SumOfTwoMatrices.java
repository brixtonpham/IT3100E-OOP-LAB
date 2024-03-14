import java.util.Scanner;

public class SumOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows, cols;
        System.out.println("Enter the dimensions of the matrices:");
        System.out.print("Number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Number of columns: ");
        cols = scanner.nextInt();

        int[][] matrix1, matrix2;
        matrix1 = input(scanner, rows, cols);
        matrix2 = input(scanner, rows, cols);
          
        int[][] resultMatrix = add(matrix1, matrix2);

        // Display the result

        System.out.println("Sum Of Two Matrices");
        displayMatrix(resultMatrix);

        scanner.close();
    }


    public static int[][] input(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    // Method to add two matrices
    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}