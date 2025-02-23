//WAP to input a number from user and print its table.

    import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input a number from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Print the multiplication table
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}


