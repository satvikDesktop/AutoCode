import java.util.Scanner;
public class NormOfNUmber {
      // square root of sum of squares of digits of a number
        public static int NormCalc(int num){
            int d=0,sum=0,norm;
          while (num!=0){
             d=num%10;
             sum+=d*d;  
             num/=10;
          }
         norm=(int)Math.sqrt(sum);
          return norm;  
        }

       public static void main (String[]args) {
          Scanner sc = new Scanner(System.in);
          int num=sc.nextInt();
         System.out.println( NormCalc(num)); 
          sc.close();  
       }
    }

