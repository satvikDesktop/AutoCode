import java.util.Scanner;

public class Passwordvalid  {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      sc.nextLine();

    while (t>0){
        int lc=0,uc=0,nc=0;
        String s = sc.nextLine();

      for (int i=0;i<s.length();i++){

          if ((int)s.charAt(i)>=97 && (int)s.charAt(i)<= 122)
                lc++;
          if ((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90)
                uc++;
          if ((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57)
                nc++;

        }

        if (uc>=1&&lc>=1&&nc>=1)
        System.out.println("YES");
        else
        System.out.println("NO");

        t--;
    }
      sc.close();  
   }
}