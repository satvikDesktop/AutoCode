package Strings;

import java.util.Scanner;
public class specialPallindrome {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a word");
      String word = sc.nextLine();
      wordCheck(word);
      sc.close();  
   }

   public static void wordCheck(String word){
      word=word.trim();
      int len=word.length();
      String newWord = "";
      for (int i=0;i<len;i++){ 
         newWord=word.charAt(i)+newWord; 
      }
      if (newWord.equalsIgnoreCase(word))
        System.out.println("Special and Pallindrome");
      else if (word.charAt(0)==word.charAt(len-1))
        System.out.println("Special");
      else
        System.out.println("None");
   }
}