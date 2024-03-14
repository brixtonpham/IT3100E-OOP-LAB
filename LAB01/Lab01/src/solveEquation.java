import java.util.Scanner;
public class solveEquation {
    public static double solveLinearEquation(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinite solutions");
            } else {
                System.out.println("No solution");
            }
            return 0;
        } else {
            return -b / a;
        }
    }

    public static void solveLinearSystem(double a1, double b1, double c1, double a2, double b2, double c2) {
        double determinant = a1 * b2 - a2 * b1;
        if (determinant == 0) {
            if (a1 / a2 == b1 / b2 && b1 / b2 == c1 / c2) {
                System.out.println("Infinite solutions");
            } else {
                System.out.println("No solution");
            }
        } else {
            double x = (c1 * b2 - c2 * b1) / determinant;
            double y = (a1 * c2 - a2 * c1) / determinant;
            System.out.println("Solution: x = " + x + ", y = " + y);
        }
    }

    public static void solveQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("No real roots");
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Double root: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: x1 = " + x1);
            System.out.println("Root 2: x2 = " + x2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSolve = true;

        while (isSolve) {
            System.out.println("Choose the type of equation to solve:");
            System.out.println("1. The first-degree equation (linear equation) with one variable");
            System.out.println("2. The system of first-degree equations (linear system) with two variables");
            System.out.println("3. The second-degree equation with one variable");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The first-degree equation (linear equation) with one variable:");
                    System.out.print("Enter the coefficient a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter the coefficient b: ");
                    double b = scanner.nextDouble();
                    System.out.println("Solution: x = " + solveLinearEquation(a, b));
                    break;
                case 2:
                    System.out.println("The system of first-degree equations (linear system) with two variables:");
                    System.out.print("Enter coefficient a1: ");
                    double a1 = scanner.nextDouble();
                    System.out.print("Enter coefficient b1: ");
                    double b1 = scanner.nextDouble();
                    System.out.print("Enter constant c1: ");
                    double c1 = scanner.nextDouble();
                    System.out.print("Enter coefficient a2: ");
                    double a2 = scanner.nextDouble();
                    System.out.print("Enter coefficient b2: ");
                    double b2 = scanner.nextDouble();
                    System.out.print("Enter constant c2: ");
                    double c2 = scanner.nextDouble();
                    solveLinearSystem(a1, b1, c1, a2, b2, c2);
                    break;
                case 3:
                    System.out.println("The second-degree equation with one variable:");
                    System.out.print("Enter coefficient a: ");
                    double quadratic_a = scanner.nextDouble();
                    System.out.print("Enter coefficient b: ");
                    double quadratic_b = scanner.nextDouble();
                    System.out.print("Enter coefficient c: ");
                    double quadratic_c = scanner.nextDouble();
                    solveQuadraticEquation(quadratic_a, quadratic_b, quadratic_c);
                    break;
                case 4:
                    isSolve = false;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        scanner.close();
    }
}
