import java.util.Scanner;
public class number_decreasing {
     public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
        for (int i=1;i<=5;i++){
            for(int j=6-i;j>=1;j--)
              System.out.print(j);
            System.out.println();
        }
        sc.close();
   }
}