package Number;
import java.util.Scanner;
public class Fibbonacci {

    public static void Generate (int n){
        int a=0,b=1,c=a+b;
        System.out.print(a+" "+b+" ");
        for (int i=1;i<=n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
       
    }
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
       Generate (n); 

      sc.close();  
   }
}