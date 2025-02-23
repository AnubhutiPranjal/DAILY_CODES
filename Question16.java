//WAP to take input 3 numbers and print the 2nd largest number among them.
import java.util.*;
public class Question16{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number 1");
    int num1=sc.nextInt();
    System.out.println("Enter a number 2");
    int num2=sc.nextInt();
    System.out.println("Enter a number 3");
    int num3=sc.nextInt();
    int secondLargest;
    if(num1>num2 && num1<num3 || num1<num2 && num1>num3){
        secondLargest = num1;
    }else if(num2>num1 && num2<num3 || num2<num1 && num2>num3){
        secondLargest = num2;
    }else{
        secondLargest= num3;
    }
    System.out.println("The second largest number is: " + secondLargest);
    
    sc.close();
    }
}