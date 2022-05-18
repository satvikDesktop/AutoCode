package Strings;

/* 
Write a program to input a string, convert it in uppercase and print the frequency of each
character.
*/
import java.util.Scanner;

public class charFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int freq[] = new int[26];  // frequency of 26 letters of alphabet
        String str = sc.nextLine();
        str=str.toUpperCase();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (Character.isDigit(ch)) 
            freq[ch-'A']+=1;  // freq stored according to position in alphabetical order
        }
        for (int i=0;i<26;i++){
            char ch=str.charAt(i);
           if (freq[i]!=0)
           System.out.println((i+'A')+" "+freq[i]); // all alphabets are checked and the ones with f>0 are printed 
        }
        sc.close();
    }
}