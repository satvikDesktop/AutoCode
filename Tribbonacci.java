
public class Tribbonacci {
   public static void main (String[]args) {
        int a=0,b=0,c=1;
        int sum=0;
        System.out.print(a+", "+b+", "+c+", ");
        for (int i=1;i<=10;i++){
            sum=a+b+c;
            System.out.print(sum+", "); 
            a=b;
            b=c;
            c=sum;
        }
        // 0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274


   }
}