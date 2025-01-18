//WAP to take input 4 digit numbers from the user and print its all digits.
import java.util.*;
public class Question8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a four digit numbers");
        int num = sc.nextInt();
        //initialising the numbers
         int digit1 = num/1000;
         int digit2 = (num/100) % 10;
         int digit3 = (num/10) % 10;
         int digit4 = num%10;

            // Print the result
            System.out.println("Digits of the number are:");
            System.out.println("First digit:" +  digit1);
            System.out.println("Second digit:" + digit2);
            System.out.println("Third digit:" +  digit3);
            System.out.println("Fourth digit:" + digit4);

        sc.close();
    }
}