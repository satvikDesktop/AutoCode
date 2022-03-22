package Arrays;
import java.util.Scanner;
public class tenDoubleDigit {
      public static void main (String[]args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter String with 20 digits");
        String twenty=sc.nextLine();
        System.out.println("Enter element to search");
        int toS=sc.nextInt();
        boolean flag=false;int indexFound=-1;
        int ten[]=new int[10];
        int k=0;
        for(int i=0;i<ten.length;i++){
            String s=twenty.charAt(k)+""+twenty.charAt(k+1);
            int num = Integer.parseInt(s);
            if (i<twenty.length()-1)
            ten[i]=num;
            else
            break;
            k+=2;
        }
        for(int i=0;i<ten.length;i++){
            if (toS==ten[i]){
            flag=true;
            indexFound=i;
            }
        }
        if (flag==true)
        System.out.println("ELEMENT FOUND AT POSITION : "+(indexFound+1));
        else 
        System.out.println("ELEMENT NOT FOUND");

        for(int i=0;i<ten.length;i++)
           System.out.println(ten[i]);
        
         sc.close();  
      }
   } 
/*   
Define a class to accept a string containing 20 digits without any space character from the user and declare
an integer array to store 10 double-digit numbers extracted sequentially from the left-hand side of the input
string. Now ask the user to enter an element to search in the array using the technique of Linear search and
if the element is found, display the number and its position in the array, otherwise display the message
“ELEMENT NOT FOUND” (assume that, position = index + 1).
*/
