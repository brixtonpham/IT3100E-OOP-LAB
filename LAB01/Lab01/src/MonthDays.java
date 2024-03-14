import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the month (full name, abbreviation, or number): ");
            String monthInput = scanner.nextLine().toLowerCase();
            System.out.print("Enter the year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); 

            // Validate month input
            int month = getMonth(monthInput);
            if (month == -1) {
                System.out.println("Invalid month. Please enter again.");
                continue;
            }

            // Validate year input
            if (year < 0) {
                System.out.println("Invalid year. Please enter a non-negative number.");
                continue;
            }

            // Check if it's a leap year
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            // Get the number of days in the month
            int days = getDaysInMonth(month, isLeapYear);

            // Display the result
            System.out.println("Number of days in " + monthName(month) + " " + year + ": " + days);

            // Ask user if they want to continue
            System.out.print("Do you want to check another month? (yes/no): ");
            String choice = scanner.nextLine().toLowerCase();
            if (choice!="yes") {
                break;
            }
        }

        scanner.close();
    }

    public static int getMonth(String input) {
        switch (input) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 1;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                return 2;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 3;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 4;
            case "may":
            case "5":
                return 5;
            case "june":
            case "jun.":
            case "jun":
            case "6":
                return 6;
            case "july":
            case "jul.":
            case "jul":
            case "7":
                return 7;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 8;
            case "september":
            case "sept.":
            case "sept":
            case "9":
                return 9;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 10;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 11;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 12;
            default:
                return -1;
        }
    }

    public static int getDaysInMonth(int month, boolean isLeapYear) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear ? 29 : 28;
            default:
                return -1;
        }
    }

    public static String monthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "";
        }
    }
}