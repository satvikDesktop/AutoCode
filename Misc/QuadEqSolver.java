package Misc;
import java.util.Scanner;
public class QuadEqSolver {
   public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Quadratic Equation : ax²+bx+c");
    System.out.println("Enter a");
    int a = sc.nextInt();
    System.out.println("Enter b");
    int b = sc.nextInt();
    System.out.println("Enter c");
    int c = sc.nextInt();
    solve(a,b,c);
    sc.close(); 
   }
   public static void solve(int a,int b,int c){

    double root1=((-1*b) + Math.sqrt((Math.pow(b,2)) - (4*a*c)) )/(2*a);
    double root2=((-1*b) - Math.sqrt((Math.pow(b,2)) - (4*a*c)) )/(2*a);

    System.out.println("Roots : "+root1+" , "+root2);
   }
}