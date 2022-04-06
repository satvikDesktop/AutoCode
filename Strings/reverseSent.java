package Strings;
import java.util.Scanner;

public class reverseSent {
   public static void main (String[]args) {
   reverseWords();
   reverseChbyCh();
   reverseWhole();
   }

   public static void reverseChbyCh(){ // reverse each character of word with same order in sentence

    Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        
        String newS = "";
        String word="";

        str=str.trim();
        str=" "+str+" ";

        int len=str.length();

        for (int i=0;i<len;i++){

            char ch=str.charAt(i);

            if (ch!=' '){
                word=ch+word;
                
            }
            else {
            newS=newS+word+" ";
            word="";
            }
            
        }

        newS=newS.trim();
        System.out.println(newS);


      sc.close(); 
   }
   public static void reverseWords(){ // reverse word order in sentence
    
    Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
    
    String newS = "";
    String word="";

    str=str.trim();
    str=" "+str+" ";

    int len=str.length();

    for (int i=0;i<len;i++){

        char ch=str.charAt(i);

        if (ch!=' '){
            word=word+ch;
            
        }
        else {
        newS=" "+word+newS;
        word="";
        }
        
    }

    newS=newS.trim();
    System.out.println(newS);


  sc.close();
   }
   public static void reverseWhole(){ // reverse entire sentence (affects word order and each character)
    
    Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
    
    String newS = "";
    int len=str.length();

    for (int i=len-1;i>=0;i--){
    char ch=str.charAt(i);
    newS+=ch;      
    }
    System.out.println(newS);
    sc.close();
   }
   
}