import java.util.Scanner;
public class FriendlyNumber {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int sum=0;
      while (num!=0){
      int d = num%10;
      sum+=d;
      num/=10;
      }
      if (sum%9==0)
      System.out.println("Number is a friendly number");
      else
      System.out.println("Number is NOT a friendly number");
      sc.close();  
   }
}