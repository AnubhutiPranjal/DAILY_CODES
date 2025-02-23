//WAP to take input 2 numbers from the user and print their difference.
import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        //Creating a Scanner object to take input from the user.
        System.out.println("The difference of number a and b is");
        Scanner sc = new Scanner (System.in);
        System.out.println("NUM a =");
        int a = sc.nextInt();
        System.out.println("NUM b =");
        int b = sc.nextInt();
        int c = a-b ;
        System.out.println("the difference of " +a+ " and " +b+ " is " +c );
        sc.close();
    }
}