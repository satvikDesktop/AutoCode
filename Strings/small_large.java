package Strings;

// Input two strings . verify whether the smaller string is at the end of the larger string

import java.util.Scanner;

public class small_large {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sL = sc.nextLine(); // larger string
        String sS = sc.nextLine(); // smaller string

        int lL = sL.length(); // length of larger string
        int lS = sS.length(); // length of smaller string

        boolean check = false;

        for (int i = 0; i < lL; i++) { // traverse larger string

            String part = sL.substring(lL - lS); // lL- lS gets index of smaller string in larger string 

            if (part.equals(sS))
                check = true;

        }

        if (check)
            System.out.println("smaller string is present at the end of the larger string ");
        else
            System.out.println("smaller string is not present at the end of the larger string ");

        sc.close();
    }
}

