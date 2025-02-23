//WAP to input a lower limit and an upper limit from user and print all the numbers in between the given limits.

import java.util.*;

public class Question29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lower limit");
        int lowerLimit = sc.nextInt();
        System.out.println("Enter a upper limit");
        int upperLimit = sc.nextInt();

        for (int i = lowerLimit; i <= upperLimit; i++) {
            System.out.println(i + "");
        }
        sc.close();
    }
}
