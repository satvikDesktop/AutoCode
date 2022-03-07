package Strings;
import java.util.Scanner;
public class nLetterWords {
        public static void main (String[]args)
         {
          Scanner sc = new Scanner(System.in);
            int n=sc.nextInt(); // length of word
            String inp = sc.nextLine(); 
            inp = inp.trim()+" "; // adding space at last to check the last word 
            String wd="";
            int f=0;

            for (int i=0;i<inp.length();i++)
            {

                char ch=inp.charAt(i); 

                if (ch==' ') // whole word is found 
                {
                    if (wd.length()==n)  // now check length if equal to n
                    f++;

                    wd="";  // and reinitialise word 
                }
                else
                {
                wd=wd+ch;  // if 'ch' not a space then word is not over 

            }
    
            System.out.println(f); // frequency of n letter words
    
          sc.close();  
    }
  }
}

