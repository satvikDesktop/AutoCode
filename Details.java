import java.util.Scanner;
public class Details {
   public static void main (String[]args) {

      Scanner sc = new Scanner(System.in);
      
      String names[]=new String[20];
      long roll[]=new long[20];
      double per[]=new double[20];  
      double avg=0.0;

      System.out.println("DETAILS");
        for (int i=0;i<20;i++){

         System.out.println("Enter name : ");
            names[i]=sc.nextLine();
         System.out.println("Enter roll number : ");
            roll[i]=sc.nextLong();
            sc.nextLine(); //
         System.out.println("Enter percentage : ");
            per[i]= sc.nextInt(); 
            sc.nextLine(); //
        }
       
        double sum=0.0;
        for (int i=0;i<20;i++){
            sum+=per[i];
            avg=sum/20.0;
         }
         System.out.println();
         System.out.println("Name\t\tRollNo.\t\tPercentage");
         for (int i=0;i<20;i++){
            System.out.println(names[i]+"\t\t"+roll[i]+"\t\t"+per[i]);
         }
         System.out.println();
            System.out.println("Class average is "+avg);
         System.out.println();   
      sc.close();  
   }
}
