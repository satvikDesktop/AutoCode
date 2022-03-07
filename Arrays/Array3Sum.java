package Arrays;
import java.util.Scanner;

public class Array3Sum {
    
   public static void main (String[]args){
          
    Scanner sc = new Scanner (System.in);
     
    System.out.println("Enter size of array");
    int  n= sc.nextInt();  //arraySize
   
    int a[]= new int[n];
    int b[]= new int[n];
    int c[]= new int[n];

    for (int k=0,i=0;k<n;k++,i++){

        System.out.println("Enter "+k+" element for array 'a' : ");
          a[k]=sc.nextInt();
        System.out.println("Enter "+k+" element for array 'b' : ");
          b[k]=sc.nextInt();
          c[i]=a[k]+b[k];
   }
   for (int i=0;i<n;i++){
      System.out.println("Sum of elements for both arrays at index "+i+" is "+c[i]);
   }
    sc.close();
   }
}
