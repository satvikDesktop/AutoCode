package Number;
  import java.util.Scanner;
public class factorialFunction {
 
public static void factorial (int num) {
  int fac=1;
 for (int i=1;i<=num;i++)
   fac*=i;
System.out.println("Factorial is : "+fac);
}

public static void main (String[]args) {
 Scanner sc = new Scanner (System.in);
 System.out.println("Enter a number");
 int num = sc.nextInt();
  factorial(num);
  sc.close();
   }

}