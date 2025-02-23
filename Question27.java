//WAP to convert a character into its toggle case.

import java.util.Scanner;

public class Question27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character.");
        char ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch)) {
            ch = Character.toLowerCase(ch);
            System.out.println(ch + " is Toggled");
        } else if (Character.isLowerCase(ch)) {
            ch = Character.toUpperCase(ch);
            System.out.println(ch + " is Toggled");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
        sc.close();
    }
}
