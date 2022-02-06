import java.util.Scanner;
public class blankspace {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter String");
      String str = sc.nextLine();

      int wordCount=0;
      int whitespaces=0;

      for (int i = 0; i < str.length() - 1; i++)
      {
         if (str.charAt(i) == ' ')
         whitespaces++;

         str=str.trim();

         if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
         wordCount++;
      }

      System.out.println("Word Count: "+(wordCount+1));
      System.out.println("Number of spaces: "+whitespaces);
      System.out.println("No. of characters : "+(str.length()));

      sc.close();  
   }
}
