package Arrays;

import java.util.Scanner;
public class MaxMinAverage {
   public static void main (String[]args) {
   Scanner sc = new Scanner(System.in);

   int len=sc.nextInt();
   int[] nums=new int[len];

    for (int i=0;i<len;i++)
    nums[i]=sc.nextInt();

    int sum=0;
    int max=nums[0],min=nums[0];  // both initialised with value of of first index
    double avg=0.0;

    for (int i=0;i<len;i++){
       sum+=nums[i];
       if (nums[i]>max)
       max = nums[i];
       else if (nums[i]< min)
       min = nums[i];
    }

   avg=sum/20.0;

   System.out.println("Average "+avg);
   System.out.println("Maximum "+max);
   System.out.println("Minimum "+min);
      

   sc.close();  
   }
}