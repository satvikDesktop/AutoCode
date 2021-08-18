import java.util.Scanner;
public class Arrays {
    public static void main (String[]args){
      Scanner sc = new Scanner (System.in);
      int a[]= new int[5];
      for (int i=0;i<5;i++){
          System.out.println("Enter elements : ");
          a[i]=sc.nextInt();
      }
      System.out.println("Elements at odd indexes");
     for (int i=0;i<5;i++){
         if(i%2!=0)
        System.out.println("Element "+a[i]+" is at index "+i);
     }
   sc.close();
    }
}
