import java.util.Scanner;
public class LinearSearch {
    // This is a linear search program 
    public static void main (String[]args){
      
      System.out.println("Enter Birth Date");
      Scanner sc = new Scanner (System.in);
      int bd = sc.nextInt();
      int a[]= new int[5];
      int i,j;
      boolean flag=false;
      for (i=0;i<5;i++){
          System.out.println("Enter element : ");
          a[i]=sc.nextInt();
      }
      for (j=0;j<5;j++){
       if (a[j]==bd){
         System.out.println("Search Successful");
         flag=true;
           break;
       }
    }
     if (flag==false)
     System.out.println("Search Insuccessful");

     sc.close();
    }
}