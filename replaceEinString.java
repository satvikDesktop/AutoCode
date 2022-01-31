import java.util.Scanner;
public class replaceEinString {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);

       System.out.println("Enter String");
       String string = sc.nextLine();

       string=string.replace('e','*');   
       string=string.replace('E','*');   

       System.out.println(string);
       
      sc.close();  
   }
}