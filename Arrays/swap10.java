package Arrays;
import java.util.Scanner;
public class swap10 {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
      int num[]= new int [10];

      for (int i = 0; i < 10; i++)   
         num[i]=sc.nextInt();

      int swapped[] = new int[10];

      for (int i = 0; i < 10; i+=2){
         swapped[i]=num[i+1];
         swapped[i+1] = num[i];
      }

      System.out.println("-----------Original array----------");

      for (int i = 0; i < 10; i++)
         System.out.print(num[i] + " ,");
   

      System.out.println("-----------Swapped array----------");

      for (int i = 0; i < 10; i++)
         System.out.print(swapped[i] + " ,");


      sc.close();  
   }
}