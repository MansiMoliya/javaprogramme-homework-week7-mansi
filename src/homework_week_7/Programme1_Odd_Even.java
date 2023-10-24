package homework_week_7;

import java.util.Scanner;
//Write a java program that tells us that Input number is odd or even?
//        HINT: use ternary operator (? :)

public class Programme1_Odd_Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value:");
        int number = scanner.nextInt();
        OddEvenNumber(number);
        scanner.close();
    }

    public static void OddEvenNumber(int number) {
        String evenOdd = (number % 2 == 0) ? "Even" : "odd";
        System.out.println("The " + number + " is " + evenOdd + " number");

    }
}
