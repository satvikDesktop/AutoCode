package Strings;
import java.util.Scanner;
public class reverseWordofString {
       public static void main(String[] args)
        {
            System.out.println("Enter a  string");
            Scanner sc=new Scanner(System.in);
            String sent = sc.nextLine();
            String result="";
            for (int i = 0; i < sent.length(); i++)
            {
                int k=i;
                while(i<sent.length()&&sent.charAt(i)!=' ')
                {
                    i++;
                }
                int j=i-1;
                while(j>=k)
                {
                    result=result+sent.charAt(j);
                    j--;
                }
                result=result+" ";
            }
            System.out.println(result);
            sc.close();
        }
    }

/*

From the beginning of the string, traverse through the string until you reach a space character.
After reaching space, reverse the previous word by iterating backward and concatenating each character into the result String
This process is continued until all the words of the input string get reversed.

*/