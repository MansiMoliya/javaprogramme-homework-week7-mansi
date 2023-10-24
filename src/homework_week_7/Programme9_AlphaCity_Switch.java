package homework_week_7;

import java.util.Scanner;

//Same as above program-9 using switch statement
public class Programme9_AlphaCity_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please first letter of city name:");
        char city = sc.next().charAt(0);
        sc.close();;
    }
    public static void switchStatement(char Alpha)
    {
        switch (Alpha){
            case 'A':
                System.out.println("Ahmedabad");
                break;
            case 'B':
                System.out.println("Bombay");
                break;
            case 'c':
                System.out.println("Calcutta");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("Etawa");
                break;
            case 'F':
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid entry");
        }
    }
}
