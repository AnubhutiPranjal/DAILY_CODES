//WAP to take input a number (range 1 to 7) from the user and print the corresponding week using switch.
import java.util.*;
public class Question18{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number upto 1 to 7:");
        int day =sc.nextInt();
        //day wise week name
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default-> System.out.println("Please enter a number range 1 to 7");
        }
        sc.close();
    }
}