package Strings;

import java.util.Scanner;
public class longestWord {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter a string:");
       String str = sc.nextLine();
       
       str += " "; //space at end of string
       String word = "", lWord = ""; // lword --> longest word in string 
       int len = str.length();
       
       for (int i = 0; i < len; i++) {
           char ch = str.charAt(i);
           if (ch == ' ') { 
               
                if (word.length() > lWord.length()) 
                    lWord = word;
                    
                word = ""; // string becomes null after one word is found
           }
           else {
               word += ch;
           }
       }
       
       System.out.println("The longest word is: " + lWord +" The length of the word: " + lWord.length());
        sc.close();
  }
}

