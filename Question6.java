//WAP to take input 3 digit numbers from the user and print sum of 1 and 3 digit.
import java.util.*;
public class Question6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit numbers");
        int num = sc.nextInt();
        //initialising the numbers
        int digit1 = num/100;
        //int digit2 = ((num/10)%10);
        int digit3 = num%10;

        int sum = digit1 + digit3;

            // Print the result
            System.out.println("Sum of the 1st and 3rd digits: " + sum);
        sc.close();
    }
}