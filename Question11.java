//WAP to take input two numbers from the user and print the largest of them.
import java.util.*;
public class Question11{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number1");
            int number1 = sc.nextInt();
            System.out.println("Enter a number2");
            int number2 = sc.nextInt();
            if ( number1>number2 ){
            System.out.println("Number 1 is greater then number 2.");
            }
            else if(number2>number1) {
                System.out.println("Number 2 is greater then number 1.");
            }
            
            else{
                System.out.println("Equal");
            }
            sc.close();
        }

    }
}