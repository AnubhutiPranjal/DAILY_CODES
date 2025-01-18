//WAP to take input 1 number from the user and print its square and cube.
import java.util.Scanner;
public class Question2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take a input from user");
        int num = sc.nextInt();
        //Square and Cube
        int square = num*num ;
        int cube = num*num*num;

        System.out.println("The square of " +num+ " is " +square);
        System.out.println("The cube of " +num+ " is " +cube);
        sc.close();
    }
}
