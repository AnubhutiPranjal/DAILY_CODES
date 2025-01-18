//WAP to calculate and print area of circle and circumference of circle.
import java.util.*;
public class Question3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take a input from user");
        double radius = sc.nextDouble();
        //Area and Circumference
        double area = (double) 3.14 *radius*radius;
        double circumference=(double) 2*3.14*radius;
         
        System.out.println("The area of circle " +radius+ " is " +area);
        System.out.println("The circumference of circle " +radius+ " is " +circumference);
        sc.close();
    }
}