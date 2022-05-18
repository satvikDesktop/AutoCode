package Strings;

import java.util.Scanner;
public class maxVowelsWord {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
      String str=sc.nextLine();
      String word="";int maxCount=0,count=0;
      String max="";
      for(int i=0;i<str.length();i++){
         char ch=str.charAt(i);

         if (Character.isWhitespace(ch)){
            count=0;

            for (int k=0;k<word.length();k++){

               char c = str.charAt(k); 
               if ("AEIOUaeiou".indexOf(c)!=1) // if character is vowel 
                  count++;
            }

            if (count>maxCount){
               maxCount=count;
               max=word;
            }
            word="";
         }
         else {
            word+=ch;
         }
      }
      System.out.println("Word with max vowels : "+max);


      sc.close();  
   }
}