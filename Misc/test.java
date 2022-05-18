package Misc;
import java.util.Scanner;
public class test {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);

      int a[] = { 3, 5, 1, 7, 8 };
      int x = ++a[2];
      int y = a[3]++;
      String s=x + " " + y;
      System.out.println(s);

      int u=65;
      u++;
      System.out.println((char)u);  

   }
}
