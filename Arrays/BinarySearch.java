package Arrays;
import java.util.Scanner;
public class BinarySearch {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);

        String name[]= new String[20];
        double height[]= new double[20];
        
       
        for (int i=0;i<20;i++){
         System.out.println("Please enter Name "); 
            name[i]=sc.nextLine();
            
         System.out.println("Please enter Height");
            height[i]=sc.nextDouble();
            sc.nextLine(); //
        }
        System.out.println("Please enter friend's height");
           double search =sc.nextDouble();
        
        int lb,ub,mid=0;
        ub=height.length-1;
        lb=0;
        boolean check=false; //flag

        while (lb<=ub){

           mid = (ub+lb)/2;
                                                     
            if (search<height[mid])  
            lb = mid + 1;                 

            else if (search==height[mid]){
            System.out.println("Friend's name and height found at "+(mid+1));
            System.out.println(name[mid]);
            System.out.println(height[mid]);
            check=true;
            break;
            }
                  
            else 
            ub = mid - 1;
        }
        
        if (check!=true)
            System.out.println("Friend's name and height not found");

      sc.close();  
      System.exit(0);
   }
}

