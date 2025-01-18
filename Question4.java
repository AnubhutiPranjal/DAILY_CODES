//WAP to take input rupees from the user and convert it into paise.
import java.util.*;
public class Question4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take a input from user");
        float rupees =sc.nextFloat();
        //Change rupee into paise
       float paise = rupees*100;
        System.out.println("The conversion of Rupee in Paise " +rupees+ " is " +paise);
        sc.close();
    }
}