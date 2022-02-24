import java.util.Scanner;
public class initials {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      name=name.trim(); // removes leading or trailing whitespaces
      int surnameIndex=name.lastIndexOf(" ");
      System.out.print(name.charAt(0)+".");
      for (int i=0;i<surnameIndex;i++){
           if (name.charAt(i)==' ')
           System.out.print(name.charAt(i+1)+".");
      } 
       System.out.print(name.substring(surnameIndex));
      sc.close();  
   }
}