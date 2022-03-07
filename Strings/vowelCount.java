package Strings;
import java.util.Scanner;

public class vowelCount {

    public static int vowelCalc (String string){
      int  vowelCounter=0;
      String vowels="";
       for (int i=0;i<string.length();i++){
       if (string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='o'||string.charAt(i)=='u'){
         vowelCounter++;     
         vowels=vowels+string.charAt(i)+" ";
       }
       
      }
       System.out.println("Vowels in the string : "+vowels);  
       return vowelCounter;
    }
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string");
      String string = sc.nextLine();
      System.out.println(vowelCalc(string));
      sc.close();  
   }
}