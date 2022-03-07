package Arrays;
import java.util.Scanner;
public class ArrayEndsInThree {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        for (int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements ending in 3 :");
        for (int i=0;i<10;i++){
            if (arr[i]%10==3)
            System.out.println(arr[i]);
        }

      sc.close();  
   }
}