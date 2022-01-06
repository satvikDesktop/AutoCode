import java.util.Scanner;
public class input {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
      // ELEMENT
      int sumE=0;
      int sumO=0;
      // INDEX
      int sumEi=0;
      int sumOi=0;
      int arr[]=new int [10];
        System.out.println("Enter 10 values");
        for (int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The array is : ");
        System.out.print("{ ");

        for (int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("}");

        for (int i=0;i<10;i++){
            if(arr[i]%2==0)  // element % 2 
            sumE+=arr[i];
            else
            sumO+=arr[i];
        }
        for (int i=0;i<10;i++){
            if(i%2==0)      // // index % 2 
            sumEi+=arr[i];
            else
            sumOi+=arr[i];
        }
        System.out.println();
        System.out.println("SUM:");
        System.out.println(sumE);
        System.out.println(sumO);
        System.out.println(sumEi);
        System.out.println(sumOi);

      sc.close();  
   }
}