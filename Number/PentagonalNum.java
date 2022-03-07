package Number;
import java.util.Scanner;
public class PentagonalNum {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
      DriverCode();
      sc.close();  
   }
  public static void DriverCode(){
      int num;
     for (int i=1;i<=100;i++){
       num = (i-1)*i + (i*(i+1)/2);
       System.out.print(num+" ");
     }
  }
}