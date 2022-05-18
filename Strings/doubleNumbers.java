package Strings;
/*  
Take a string containing numbers and alphabets. 
Display the double of the concatenated digits  from the string. 
Example : 
If the string is “ ch4an6di8garh “ then the concatenated number is 468. 
The double of which is 936. So 936 should be displayed. 
If there is no digits in the string then the message “String contain no digits” .
*/

public class doubleNumbers {
    public static void main(String[] args) {
        String str = "ch4an6di8garh";
        String numStr = "0";
        int num = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            /* 

            int uc = (int) ch;  ASCII code of character
             if (uc >= 48 && uc <= 57) if ASCII code corresponds to any digit (0-9)
                 numStr += ch; 

            */

            if (Character.isDigit(ch))
            numStr+=ch;

            num = Integer.parseInt(numStr); // converting numeric string to integer


        }
        System.out.println(2 * num);
    }

}
// output is 936