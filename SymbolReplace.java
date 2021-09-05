import java.util.Scanner;
public class SymbolReplace {
    public static void Driver (){
        Scanner sc = new Scanner (System.in);
       
        System.out.println("Enter character to be replaced");
        char toBereplaced = sc.nextLine().charAt(0);
        System.out.println("Enter a character");
        char replacer = sc.nextLine().charAt(0);
        char[] line1 = new char[]{ 'A','@','?','>','='};  // originalcharacters
         int initLineLength=line1.length; // initial array length
         int count=0;
        for (int i=0;i<initLineLength;i++){ 
          int k=0;
          count++;
        for ( k=0;k<initLineLength+1-count;k++){ 
          if (line1[k]==toBereplaced)
              System.out.print(replacer); 
          else
          System.out.print(line1[k]);
        }
        System.out.println();
      }
        sc.close();
    }
   public static void main (String[]args) {
      
      Driver();
    
   }
}
