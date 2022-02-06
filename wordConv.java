import java.util.Scanner;
public class wordConv {
   public static void main (String[]args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string:");
      String string = sc.nextLine();
      String str=""; 
      string=string.toLowerCase();
      for (int i=0;i<string.length();i++){
        char charac=string.charAt(i);
       if (charac =='a' || charac =='e' ||charac =='i' || charac =='o' || charac =='u')
         charac+=1;
         str+=charac;
      }

    System.out.println(str);
      sc.close();   
   }
}   