package Arrays;
//CodeChef
// The Smallest Pair Problem  Code: SMPAIR
import java.util.Scanner;
public class TheSmallestPair {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
     
        int t = sc.nextInt();
        do{
            int l = sc.nextInt();
            int list[]= new int[l];
            for (int i=0;i<l;i++){
                list[i]=sc.nextInt();
            }
            // Bubble sort 
            for (int i = 0; i < l-1; i++)
            for (int j = 0; j < l-i-1; j++)
                if (list[j] > list[j+1])
                {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
                int sum;
                sum=list[0]+list[1];

            System.out.println(sum);

        } while (t!=0);

      sc.close();  
   }
}