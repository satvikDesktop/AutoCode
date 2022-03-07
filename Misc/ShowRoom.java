package Misc;
import java.util.Scanner;

public class ShowRoom {
 
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;

     ShowRoom (String n,long mb,double c){  // Constructor
        name=n;
        mobno=mb;
        cost=c;
     }
     public void calculate (){
        if (cost<=10000)
         dis = 5.0/100.0 * cost ;
        else if (cost>10000 && cost<=20000)
         dis = 10.0/100.0 * cost ;
        else if (cost>20000 && cost<=35000)
         dis = 15.0/100.0 * cost ;
        else
        dis = 20.0/100.0 * cost ;
        amount = cost - dis;
     }
     public void display (){
        System.out.println("Name : "+name);
        System.out.println("Mobile No. : "+mobno);
        System.out.println("Amount after discount : ₹"+amount);
     }
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
       ShowRoom ob = new ShowRoom("Name",0000000000L,7000.00);  // Name , Mobile number , Cost 
       ob.calculate();
       ob.display();
      sc.close();  
   }
}