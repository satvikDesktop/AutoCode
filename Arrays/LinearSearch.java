package Arrays;

import java.util.Scanner;
public class LinearSearch {
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    double arr[]= new double[20];
    boolean flag=false;
     System.out.println("Input percentage of the class ");
        for (int i=0;i<20;i++){
            arr[i]=sc.nextDouble();
        }
        System.out.println("Enter topper's percentage");
        double topper= sc.nextDouble();

        for (int i=0;i<20;i++){

            if (arr[i]==topper){
                System.out.println("Percentage found it is at "+(i+1)+" th position");
                flag=true;
                break;
        }           
    }
        if(flag==false)
     System.out.println("Percentage not found "); 

     sc.close();
  }
}
