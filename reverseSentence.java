import java.util.Scanner;
public class reverseSentence {
       public static void main(String[] args)
       {
          System.out.println("Enter a string");
          Scanner sc=new Scanner(System.in);
          String sent=sc.nextLine();
          sent=sent.trim(); 
          // empty String to hold output
          String newSent="";
     
          for (int i = sent.length()-1; i >=0; i--)
          {         
             int k=i;
             
             //iterating from the end until i points to space
             while (i>=0 && sent.charAt(i)!=' ')   
             {                       
                i--;                 
             }
             int j=i+1;
             //copying words into result string
             while (j<=k)
             {
                newSent+=sent.charAt(j);
                j++;
             }
           newSent+=" ";
          }
          System.out.println(newSent);
          sc.close();
       }
    }

/*

 Iterate back from the end of the array until you reach space, here you will get the last word.
 Using an inner loop, concatenate each character of that last word into a new empty String (newSent)
 And repeat the first step until you get another space character, here you will get the second last word.
 Move each character of that second last word into the result String.
 Repeat the above steps for subsequent words until the complete sentence gets reversed.

 */