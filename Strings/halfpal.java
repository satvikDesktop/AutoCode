package Strings;
import java.util.Scanner;
/*
Define a class to accept a string, convert it into lowercase and check whether the string is HalfPal or not. ( A HalfPal is a word which reads the same half way )
*/
public class halfpal {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String str=sc.nextLine();
        int len=str.length();
        
            String fh=str.substring(0,(len/2)); // first half
            String lh=str.substring((len/2)); // second half

            if (len%2!=0) // if string is not divisible in two parts 
            System.out.println("not a half pal string"); 
            else if (fh.equals(lh))
            System.out.println("half pal string"); 
            else 
            System.out.println("not a half pal string"); 
   
   
        sc.close();  
    }
} 

