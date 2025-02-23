//WAP to input year from user and check whether it is a leap year or not.
import java.util.*;
public class Question19{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year.");
        int leapYear = sc.nextInt();
        if((leapYear % 4 == 0 && leapYear % 100 ==0) || (leapYear % 400 == 0)){
            System.out.println(leapYear +" is a leap year");
        }else{
            System.out.println(leapYear +" is not a leap year");
        }
        sc.close();
    }
}