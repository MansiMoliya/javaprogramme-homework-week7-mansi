package homework_week_7;

import java.util.Objects;
import java.util.Scanner;

public class Programme10_CalculatorIfElse {

    // taking input from user in main method using Scanner object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter Operation (+, -, *, /): ");
        String operation = sc.next();

        operations(firstNumber, operation, secondNumber); // calling a method for calculation
        sc.close(); // closing the scanner object
    }

    //method to do the calculation as per the selection
    public static void operations(int a, String ab, int b){
        if (Objects.equals(ab, "+")){
            System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
        } else if (Objects.equals(ab, "-")) {
            System.out.println("Subtraction of " + a + " and " + b + " is " + (a - b));
        } else if (Objects.equals(ab, "*")) {
            System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
        } else if (Objects.equals(ab, "/")) {
            System.out.println("Division of " + a + " and " + b + " is " + (a / b));
        } else {
            System.out.println("Invalid Operation");
        }
    }
}
