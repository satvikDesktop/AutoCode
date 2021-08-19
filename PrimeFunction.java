import java.util.Scanner ;
public class PrimeFunction {
    public static int isPrime (int num) {
       int c=0;
        for (int i=1;i<=num;i++){
             if (num%i==0)
                    c++;
        }
        if (c==2)          
        return 0;
        else 
        return 1;
    }
    public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
  System.out.println( isPrime(num));
    sc.close();  
    }
}
