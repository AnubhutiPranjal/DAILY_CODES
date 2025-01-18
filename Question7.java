//WAP to take input 3 digit numbers from the user and print the square of the middle digit.
import java.util.*;
public class Question7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit numbers");
        int num = sc.nextInt();
        //initialising the numbers
        //int digit1 = num/100;
         int digit2 = ((num/10)%10);
       // int digit3 = num%10;

        int square = digit2*digit2;

            // Print the result
            System.out.println("Square of second digit "+square);
        sc.close();
    }
}