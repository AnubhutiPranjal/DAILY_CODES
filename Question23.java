//WAP to calculate the area of rectangle, circle and triangle as per user's choice.
import java.util.*;
public class Question23{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Choose the number from 1 to 3:");
        System.out.println("1. Triangle");
        System.out.println("2. Circle");
        System.out.println("3. Rectangle");
        System.out.println("Enter choice:1,2,3 :");

        int choose =sc.nextInt();

        switch(choose){

            case 1 ->{
                System.out.println("Area of the Circle");
                double radius = sc.nextDouble();
                double area_Circle = 3.14*radius*radius;
                System.out.println("Area of Circle:"+area_Circle);
            }
            case 2 ->{
                System.out.println("Area of the triangle");
                double base =sc.nextDouble();
                double height =sc.nextDouble();
                double area_Triangle =0.5*base*height;
                System.out.println("Area of Triangle:"+area_Triangle);
            }
            case 3 ->{
                System.out.println("Area ofthe rectangle");
                double width = sc.nextDouble();
                double height = sc.nextDouble();
                double area_Rectangle =width*height;
                System.out.println("Area of Rectangle:"+area_Rectangle);
            }
        }
        
        sc.close();
    }
}