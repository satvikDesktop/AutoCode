package Strings;

import java.util.Scanner;

public class lengthOFstring  {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);

      String one=sc.nextLine();
      String two=sc.nextLine();
      one=one.toUpperCase();
      two=two.toUpperCase();
      
      if (one.equals(two))
        System.out.println("Equal Strings");

      else{ 
       if (one.length()>two.length())
       System.out.println("String one is larger");
       else if (two.length()>one.length())
       System.out.println("String two is larger");
       else 
       System.out.println("Both strings are of same length but not equal");
      }

      sc.close();  
   }
}
