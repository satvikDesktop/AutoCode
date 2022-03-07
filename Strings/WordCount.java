package Strings;
import java.util.Scanner;
public class WordCount {

    public static int spaceCount(String line){
       int count=0;
       for (int i=0;i<line.length();i++){
           if (line.charAt(i)==' '){
                 count++;
           }
       }  
       return count+1;
    }

   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a sentence");
      String line = sc.nextLine();
      System.out.println( "Number of words : "+spaceCount(line));
      sc.close();  
   }
}