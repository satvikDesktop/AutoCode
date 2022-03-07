package Arrays;
import java.util.Scanner;
public class ArraysProgram {
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter friend's roll number : ");
    int roll = sc.nextInt();
    int a[]= new int[20];
     boolean flag=false;

    for (int k=0;k<20;k++){

        System.out.println("Enter roll numbers ");
          a[k]=sc.nextInt();

    }
    for (int k=0;k<20;k++){
        if (a[k]==roll){
            System.out.println("Roll number found it is at "+(k+1)+" position");
            flag=true;
            break;
        }  
    }
    if(flag==false)
     System.out.println("Roll number not found ");
    
    sc.close();  

       }
}
