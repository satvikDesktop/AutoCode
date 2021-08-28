import java.util.Scanner;
public class SeriesSumConflict {
      // Same answer
     public static int SumSeries1(){   // Mine
         int s=0,prod=1;
         for (int i=1;i<=20;i++){
             prod*=i;
             s+=prod;
         }
        return s;
     }
     public static int SumSeries2(){  // Ma'am's
        int s=0,f=1;
        for (int i=1;i<=20;i++){
             f=1;
        for (int j=1;j<=i;j++){     
            f*=j;
        }
        s+=f;
      }
      return s;
    }
   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
      System.out.println(SumSeries1());
      System.out.println(SumSeries2());
      sc.close();  
   }
}
