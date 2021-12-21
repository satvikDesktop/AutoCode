import java.util.Scanner;
public class special_number {
   public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int temp=num;
    int sum=0;
    int f=1;
    while(temp!=0){
        int d=temp%10;
        f=1;
        for (int i=d;i>=1;i--) {
            f*=i;   
        }
        sum+=f;
        temp/=10;
    }
        System.out.println(sum);
    sc.close();  
   }
}
