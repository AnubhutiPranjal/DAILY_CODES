//WAP to take input 3 numbers from the user and print the largest number among them using AND operator.

//--The and operator in Java is represented by the logical operator && (logical AND) 
//--and the bitwise operator & (bitwise AND)
import java.util.*;
public class Question14{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        //assigning numbers
        System.out.println("enter the first number");
        int number1 = sc.nextInt();
        System.out.println("enter the second number");
        int number2 = sc.nextInt();
        System.out.println("enter the third number");
        int number3 = sc.nextInt();

        //AND operator 
        if(number1 > number2 && number1 > number3){
            System.out.println("Number 1 is greater.");
        }
        else if (number2 > number1 && number2 > number3){
            System.out.println("Number 2 is greater.");
        }
        else{
            System.out.println("Number 3 is greater.");
        }
        sc.close();
    }
}
