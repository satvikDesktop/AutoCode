package Strings;

import java.util.Scanner;
/* 
Wap to input a string and create an encrypted string by printing the succeeding character of the string 
but if the character is Z/z , A/a will be printed 
*/
public class encryptedStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String encrypt = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if ((ch == 'Z') || (ch == 'z')) {
                if (ch == 'Z')
                    encrypt += 'A';
                else
                    encrypt += 'a';
            } else {
                encrypt += (char) (ch + 1);
            }
        }

        System.out.println(encrypt);
        sc.close();
    }
}
