package Strings;
/*
To translate a word into a Piglatin word, convert the word into uppercase and then place the first vowel of the original word as the start of the new word along with the remaining alphabets. The alphabets present before the vowel being shifted towards the end followed by “AY”.
*/
import java.util.Scanner;
public class piglatin {
   public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string"); 
    String str=sc.nextLine();

    str=str.toUpperCase();
    int len=str.length();

//   before vowel       after vowel    new string
    String prefix="",      rem="",       newS="";
    int pos=-1; // position of first vowel

      for(int i=0;i<len;i++){
          char ch=str.charAt(i);
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            pos=i;
            break;
        }
      }

      if (pos!=-1){ // if vowel present in string
        prefix=str.substring(0,pos); 
        rem=str.substring(pos+1);
        newS=str.charAt(pos)+rem+prefix+"AY";

        System.out.println("New String = "+newS);
      }
      else{
          System.out.println("NOT PIG LATIN");
      }

    sc.close();  
   }
}