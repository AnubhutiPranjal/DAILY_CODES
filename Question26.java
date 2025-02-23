//WAP to check whether a character given by user is a vowel or consonant.

import java.util.Scanner;

public class Question26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet.");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is vowel");
            } else {
                System.out.println(ch + " is consonant");
            }
        } else {
            System.out.println(ch + " is not an alphabet");
        }
        sc.close();
    }
}
