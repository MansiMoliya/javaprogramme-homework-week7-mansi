package homework_week_7;

import java.util.Scanner;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//        any other alphabet should be invalid entry

public class Programme8_AlphaCityOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the city name:");
        char city = sc.next().charAt(0);
        cityName(city);
        sc.close();
    }

    public static void cityName(char ch) {
        if (ch == 'A') {
            System.out.println("Ahmedabad");
        } else if (ch == 'B') {
            System.out.println("Bombay");
        } else if (ch == 'C') {
            System.out.println("Calcutta");
        } else if (ch == 'D') {
            System.out.println("Delhi");
        } else if (ch == 'E') {
            System.out.println("Etawa");
        } else if (ch == 'F') {
            System.out.println("Faridabad");
        } else {
            System.out.println("Invalid City name!");
        }
    }
}
