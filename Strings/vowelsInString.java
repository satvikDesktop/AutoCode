package Strings;
import java.util.Scanner;
public class vowelsInString {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter String");
      String string = sc.nextLine();
       int count=0;
       string=string.toLowerCase();
      for (int i=0;i<string.length()-1;i++){
         char charac=string.charAt(i);
        if (charac =='a' || charac =='e' ||charac =='i' || charac =='o' || charac =='u')
         count++;
       }
       System.out.println(count);
      sc.close();  
   }
}