package Strings;
import java.util.Scanner;
public class decimalString {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter 10 decimal values"); 
       double arr[]=new double[10];
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextDouble();

        for(int i=0;i<arr.length;i++){
            String num=String.valueOf(arr[i]);
            int index=num.indexOf('.');
            System.out.print(num.substring(0,index)+" ");
        }

      sc.close();  
   }
}
