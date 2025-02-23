//WAP to take input rate & quantity and calculate the amount. Finally print net amount to be paid after allowing 15% discount if amount exceeds 2000 rs.
import java.util.*;
public class Question15{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter rate:");
    double rate=sc.nextDouble();
    System.out.println("Enter Quantity: ");
    int Quantity=sc.nextInt();
    double amount=rate*Quantity;
    double netamount;
    if(amount>2000){
         netamount=amount-(amount*0.15);
    }else{
        netamount=amount;
    }
    System.out.println("Netamount to be paid:"+netamount);
    sc.close();
}
}