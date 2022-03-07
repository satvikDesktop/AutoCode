package Arrays;
import java.util.Scanner;
public class ArraySearch {
    public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter percentage of topper : ");
      double pT = sc.nextDouble();
    String names[]= new String[20];
    double marks[]= new double[20];
    boolean flag=false;
    for (int k=0;k<20;k++){
      System.out.println("Enter Name : ");
      names[k]=sc.nextLine();
    System.out.println("Enter Percentage : ");
    marks[k]=sc.nextDouble();
    }
    for (int i=0;i<20;i++){
       if (pT==marks[i] ){
           System.out.println("Percentage of topper found ");
           System.out.println("Name : "+names[i]);
           System.out.println("Percentage : "+marks[i]);
           flag=true;
           break;
       }
    }
    if (flag==false)
    System.out.println("Percentage of topper not found ");
    sc.close();  
       }   
}
