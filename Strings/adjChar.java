package Strings;
import java.util.Scanner;

/* 
WAP to swap the adjacent characters in a string but if the length of the string is odd 
then don't swap the last character
*/


public class adjChar {
    public static void main (String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        
        str=str.trim();
        String newS="";
        int len=str.length();

        if (len%2==0){
            
            
            for (int i=0;i<=len-2;i+=2)  {
                char ch=str.charAt(i);
                char ch1=str.charAt(i+1);
                newS=newS+ch1+ch;                
            }

        }  
        else{

            for (int i=0;i<=len-2;i+=2)  {
                char ch=str.charAt(i);
                char ch1=str.charAt(i+1);
                newS=newS+ch1+ch;                
            }
            newS+=str.charAt(len-1);
        }   

        System.out.println(newS);   
  
        sc.close();  
    }
}

