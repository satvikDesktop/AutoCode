package Strings;
import java.util.Scanner;

public class concatStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3="";
        int l1 = s1.length();
        int l2 = s2.length();
        int dif;

        if (l1 == l2){
        System.out.println(s1 + s2);
        }
        else {
            if (l1 > l2) {
                dif=l1-l2;
                for (int i=dif;i<l1;i++)
                    s3=s3+s1.charAt(i);
                System.out.println(s2+s3);
            }
            else {
                dif=l2-l1;
                for (int i=dif;i<l2;i++)
                    s3=s3+s2.charAt(i);
                System.out.println(s1+s3);
            }
        }

        sc.close();
    }
}