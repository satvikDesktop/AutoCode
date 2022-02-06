import java.util.Scanner;
 
class pallindromeString
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string:");
      String str = sc.nextLine();
      String reverse = "";
 
      int length = str.length();
 
      for ( int i = length-1; i > 0; i-- )
         reverse += str.charAt(i);
 
      if (str.equalsIgnoreCase(reverse))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");

         sc.close();
 
   }
}
