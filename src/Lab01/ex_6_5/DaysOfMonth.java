package Lab01.ex_6_5;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter month (name, abbreviation, or number):");
            String monthInput = scanner.nextLine().trim();
            int month = convertMonthInput(monthInput);

            System.out.println("Enter year (non-negative number):");
            String yearInput = scanner.nextLine().trim();
            int year = convertYearInput(yearInput);

            if (month == -1 || year == -1) {
                System.out.println("Invalid input, please try again.");
            } else {
                int days = getDaysOfMonth(month, year);
                System.out.println("Number of days: " + days);
                break; // Exit the loop after successfully getting the number of days
            }
        }
        scanner.close();
    }

    private static int convertMonthInput(String input) {
        input = input.toLowerCase();
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
            case "may.":
            case "5":
                return 5;
            case "june":
            case "jun":
            case "jun.":
            case "6":
                return 6;
            case "july":
            case "jul":
            case "jul.":
            case "7":
                return 7;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 8;
            case "september":
            case "sep.":
            case "sep":
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
                return -1; // Invalid month input
        }
    }

    private static int convertYearInput(String input) {
        try {
            int year = Integer.parseInt(input);
            if (year >= 0) {
                return year;
            } else {
                return -1; // Year is negative
            }
        } catch (NumberFormatException e) {
            return -1; // Invalid year input
        }
    }

    private static int getDaysOfMonth(int month, int year) {
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            case 2: // February
                return isLeapYear(year) ? 29 : 28;
            default:
                // This should never happen if inputs are validated correctly
                return -1;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
