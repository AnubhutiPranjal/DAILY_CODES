//WAP to input a number from user and print its factorial.

import java.util.*;

public class Question31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial*i;
        }
        System.out.println("Factorial of " + num + " is:" + factorial);
        scanner.close();
    }
}
