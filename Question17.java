//WAP to take input a number (range 1 to 7) from the user and print the corresponding days of week using if else.
import java.util.*;
public class Question17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number upto 1 to 7:");
        int day =sc.nextInt();
        //day wise week name
        if(day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }else if(day==6){
            System.out.println("Saturday");
        }else if(day==7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Please enter a number range 1 to 7");
        }
        sc.close();
    }
}