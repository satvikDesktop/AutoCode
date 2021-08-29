
import java.util.Scanner;
public class RandomSeries {
public static void main (String[]args) {
Scanner sc = new Scanner(System.in);
  double x= sc.nextDouble();
  double fac=0.0,term=0.0;
    for (double i=2;i<=20;i+=2){
         int k=1;
        while (k<=x){
            fac=k*x;
            k++;
        }
       term+=i/fac;
    }
    System.out.println(term);
    sc.close();
   }
}