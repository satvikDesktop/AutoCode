package Strings;

import java.util.Scanner;

public class upperLower  {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string");
      String string=sc.nextLine();
      String new_string="";

     for (int i=0;i<string.length();i++){

         char charac = string.charAt(i);
         int numVal=charac;

            if (numVal>=65 && numVal<97){
            charac=Character.toLowerCase(charac);
                new_string+=charac;
            }
            else if  (numVal>=97){
            charac=Character.toUpperCase(charac);
            new_string+=charac;
            }
            else
            new_string+=charac;
     }

     System.out.println(new_string);

      sc.close();  
   }
}
// Write a program in Java to accept a string in lower case 
// and change the first letter of every word to upper case. Display the new string.