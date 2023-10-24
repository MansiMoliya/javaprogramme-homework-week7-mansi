package homework_week_7;

import java.util.Scanner;

public class Programme6_CheckOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value:");
        int number = scanner.nextInt();
        OddEvenNumber(number);
        scanner.close();
    }

    public static void OddEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
