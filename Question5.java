//WAP to take input days from the user and convert it into years, months, and remaining days.
import java.util.*;
public class Question5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of days");
        int totalDays = sc.nextInt();

        int year = totalDays /365 ;
        int remaningDaysAfterYear = totalDays % 365 ;
        int months = remaningDaysAfterYear/30;
        int remainingDays = remaningDaysAfterYear % 30 ;
        System.out.println(year + " years, " + months + " months, and " + remainingDays + " days");
        sc.close();
    }

}