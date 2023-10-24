package homework_week_7;

import java.util.Scanner;

public class Programme2_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = Integer.parseInt(scanner.nextLine());
        leapYear(year);
        scanner.close();
    }

    public static void leapYear(int year) {
        if (year % 400 == 0 && year % 100 == 0 && year % 4 == 0) {
            System.out.println("The year is a leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year");
        }

    }
}
