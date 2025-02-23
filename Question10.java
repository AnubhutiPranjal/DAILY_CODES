//WAP to check whether the number is positive, negative or zero.
import java.util.*;
public class Question10{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int num = scanner.nextInt();
            //check number is even or odd
            if (num > 0) {
                System.out.println("The number is positive.");
            } else if (num < 0){
                System.out.println("The number is negitive.");}
             else{
                System.out.println("The number is 0");
            }
            scanner.close();
        }

    }
}