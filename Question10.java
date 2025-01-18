//WAP to check whether the number is positive, negative or zero.
//WAP to check whether a number is even or odd.
import java.util.*;
public class Question10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        //check number is even or odd
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0){
            System.out.println("The number is negitive.");}
         else{
            System.out.println("The number is 0");
        }
        sc.close();

    }
}