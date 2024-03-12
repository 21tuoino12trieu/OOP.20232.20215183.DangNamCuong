package Lab01.ex_6_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month, year;
        System.out.print("Enter the month (1-12): ");
        month = sc.nextInt();
        System.out.print("Enter the year: ");
        year = sc.nextInt();
        int numDays = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }

        // Output the result
        if (numDays != 0) {
            System.out.println("The number of days in month " + month + " of year " + year + " is " + numDays + ".");
        }
    }
}