package Arrays;

 import java.util.Scanner;
 // WAP IN JAVA TO ENTER 10 NUMBERS INTO SDA AND THEN SWAP FIRST HALF OF THE ARRAY  WITH LAST HALF 
/*

// index no.   0 1 2 3 4 5 6 7 8 9 

SAMPLE INPUT:  1 2 3 4 5 6 7 8 9 10 
SAMPLE OUTPUT: 10 9 8 7 6 5 4 3 2 1

*/
public class swapSDA {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int arr[] = new int[10];

      System.out.println("Enter 10 numbers: ");

      for (int i = 0; i < 10; i++)
         arr[i] = sc.nextInt();


      int ptr1=0,ptr2=5,temp;

      while (ptr2 < 10) {
         temp = arr[ptr1];
         arr[ptr1] = arr[ptr2];
         arr[ptr2] = temp;
         ++ptr1;
         ++ptr2;
      }
      

      System.out.println("Swapped array : ");
      for (int i = 0; i < 10; i++)
         System.out.print(arr[i] + " ");

      sc.close();
   }
   public static void swap (){

   }
}