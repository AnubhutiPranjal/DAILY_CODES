//WAP to perform arithmetic operations as per user's choice.

import java.util.*;

public class Question22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter a arthematic operation which you want to perform:");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        System.out.println("Enter choice:1,2,3,4,5:");
        int operations = sc.nextInt();
        switch (operations) {
            case 1 -> {
                int sum = a + b;
                System.out.println("Sum of the numbers " + sum);
                break;
            }

            case 2 -> {
                int sub = a - b;
                System.out.println("Sub of the numbers " + sub);
                break;
            }

            case 3 -> {
                int multiplication = a * b;
                System.out.println("Multiplication of the numbers " + multiplication);
                break;
            }

            case 4 -> {
                int division = a / b;
                System.out.println("Division of the numbers " + division);
                break;
            }

            case 5 -> {
                int modulus = a % b;
                System.out.println("Modulus of the numbers " + modulus);
                break;
            }
            default -> System.out.println("Enter a valid number");
        }
        
        sc.close();
    }
}
