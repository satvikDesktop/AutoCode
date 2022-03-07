package Strings;
import java.util.Scanner;
public class DoubleLetterSequences {
       public static void main (String[]args) {
          Scanner sc = new Scanner(System.in);
          String inp = sc.nextLine();  
          inp = inp.trim()+" "; // adding space at last to avoid index out of bounds
          inp=inp.toUpperCase();
          int f=0;
          int len =inp.length();
        
          for (int i=0;i<len-1;i++) // i<inp.length()-1  because char will be a space 
          // ∴ we can check each letter till len -2 
        
          {

              char ch=inp.charAt(i); 
              char ch1=inp.charAt(i+1); // this will not give index out of bounds as we go till len-2

            if (Character.isLetter(ch)&& Character.isLetter(ch)){ // to check if character is letter 
              if (ch==ch1)  // last check will be of last letter and space 
              f++;
            }

          }
          System.out.println(f); // frequency of double letter 
    
          sc.close();  
       }
}
    

