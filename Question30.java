//WAP to input a lower limit and an upper limit from user and print all the even numbers in between the given limits.
import java.util.*;

public class Question30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lower limit");
        int lowerLimit = sc.nextInt();
        System.out.println("Enter a upper limit");
        int upperLimit = sc.nextInt();
        for (int i = lowerLimit; i <= upperLimit; i++) {
            System.out.println(i + "");
            if (i%2==0) {
                System.out.println(i+" is even");
            }else{
                System.out.println(i+" is odd");
            }
        }
        sc.close();
    }
}
