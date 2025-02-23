//WAP to take input 3 numbers from the user and print the largest number among them using nested if.
import java.util.Scanner;
public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int number1 = sc.nextInt();
        System.out.println("enter the second number");
        int number2 = sc.nextInt();
        System.out.println("enter the third number");
        int number3 = sc.nextInt();

        //nested if condition
        if(number1>number2){
            if(number1>number3){
                System.out.println("Number 1 is greater");
            }
            else{
                System.out.println("Number 3 is greater");
            }
        }
        else{
            if(number2>number3){
                System.out.println("Number 2 is greater");
            }
            else{
                System.out.println("Number 3 is greater");
            }
        }
        sc.close();
    }
}