// CodeChef
// Total Expenses Problem Code: FLOW009
package Misc;
import java.util.Scanner;
public class TotalExpenses {
   public static void main (String[]args) {

      Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        do{
          int q = sc.nextInt();
          int p = sc.nextInt();
          double d=0;
          if (q>1000)
            d=10.0/100.0*p;
          System.out.println((p-d)*q);
            t--;
        } while (t!=0);

      sc.close();  
   }
}