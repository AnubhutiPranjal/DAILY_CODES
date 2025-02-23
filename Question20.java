//WAP to take input 3 numbers from the user and print the numbers in the descending order.

import java.util.*;

public class Question20 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1.");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2.");
        int num2 = sc.nextInt();
        System.out.print("Enter Number 3.");
        int num3 = sc.nextInt();

        /*if (num1 >= num2 && num1 >= num3) {
            System.out.print(num1+" ");
            if (num2 >= num3) {
                System.out.print(num2 + " " + num3);
            } else {
                System.out.print(num3 + " " + num2);
            }
        }else if(num2>=num1 && num2>=num3){
            System.out.print(num2+ " ");
            if(num1>=num3){
                System.out.print(num1+ " " +num3);
            }else {
                System.out.print(num3+ " " +num1);
            }
        }else{
            System.out.print(num3+ " ");
            if(num1>=num2){
                System.out.print(num1+" "+num2);
            }else{
                System.out.print(num2+" "+num1);
            }
        }*/
        int [] lst = {num1 , num2 , num3};
        Arrays.sort(lst);
        System.out.println("Number in descending order ");
        for (int i = lst.length-1; i >=0 ; i--) {
            System.out.print(lst[i]+ " ");
        }
    }
}
