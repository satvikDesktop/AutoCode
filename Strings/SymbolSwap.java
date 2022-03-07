package Strings;
import java.util.Scanner;
public class SymbolSwap {
    public static void Swapper () {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter characters to be swapped");
        char swapped = sc.nextLine().charAt(0);
        char swapper = sc.nextLine().charAt(0);
        char temp;
         char[] line1 = new char[]{ 'A','@','?','>','='};     // originalcharacters
         int indexOfSwapped=0,indexOfSwapper=0;

        for (int i=0;i<line1.length;i++){
              if (line1[i]==swapped)
                indexOfSwapped=i;
              if (line1[i]==swapper)
                indexOfSwapper=i;
        }
        for (int i=0;i<line1.length;i++){
              temp=line1[indexOfSwapped];
              line1[indexOfSwapped]=line1[indexOfSwapper];
              line1[indexOfSwapper]=temp;
        }
         int initLineLength=line1.length;                   // initial array length
         int count=0;
        for (int i=0;i<initLineLength;i++){ 
          int k=0;
          count++;
        for ( k=0;k<initLineLength+1-count;k++){ 
              System.out.print(line1[k]);  
        }
        System.out.println();
      }
      sc.close();
    } 

   public static void main (String[]args) {
        Swapper(); 
   }
}