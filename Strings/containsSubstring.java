/*

program to find if a substring is part of a string and also print the index from which it starts

*/

package Strings;

public class containsSubstring {
   
   public static void main (String[]args) {

      check("acknowledge","now");

   }

   public static void check(String str,String toS) {

       str=str.toUpperCase();
       toS=toS.toUpperCase();

       int index=-1;
       index=str.indexOf(toS);
     
      if (index!=-1)
      System.out.println("substring found , starts at : "+index);
      else
      System.out.println("substring not found");

   }

}
