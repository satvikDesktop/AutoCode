import java.util.Scanner;
public class vowelsInString {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter String");
      String string = sc.nextLine();
    
      for (int i=0;i<string.length();i++){

        if (string.charAt(i)=='a' || string.charAt(i)=='e' ||string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u')
            System.out.println(string.charAt(i)+" at index "+i);

       }
      sc.close();  
   }
}