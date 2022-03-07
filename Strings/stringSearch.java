package Strings;
// Wap to accept names of 10 cities in a single dimensional array and their STD codes in antoher 1d array
// Search for a name of the city inputted
// if found print search succeful and also the name and STD code
// else search unsucceful
import java.util.Scanner;
public class stringSearch {
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
      String names[]= new String[10];  
      long STD[]= new long[10]; 
      String city=sc.nextLine();
      boolean flag=false;
      
      for (int i=0;i<10;i++){
        System.out.println("Enter city name");
         names[i]=sc.nextLine();
         System.out.println("Enter STD code");
         STD[i]=sc.nextLong();
        }
        
      for (int i=0;i<10;i++){
            if (names[i].equalsIgnoreCase(city)){
                System.out.println("City Name: "+city+" STD Code: "+STD[i]);
                flag=true;
                break;
            }
      }

    if (flag==false)
    System.out.println("Search unsuccesful , city not found");
      sc.close();  
   }
}