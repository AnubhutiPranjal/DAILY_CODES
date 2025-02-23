//WAP to input a character from user and check whether it is uppercase and lowercase.

import java.util.Scanner;

public class Question25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character.");
        char ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an UpperCase");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a LowerCase");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
        sc.close();
    }
}
