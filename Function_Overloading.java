import java.util.Scanner;

public class Function_Overloading {

    public static void num_cal(int num, char ch){   
          if (ch=='s')
          System.out.println("Square of "+num+" is: "+(num*num));
          else
          System.out.println("Cube of "+num+" is: "+(num*num*num));
    }
    public static void num_cal(int a,int b, char ch){
        if (ch=='p')
        System.out.println("Product of "+a+" and "+b+" is " +(a*b));
        else
        System.out.println("Sum of "+a+" and "+b+" is " +(a+b));
    }
    public static void num_cal(char a, char b){
          if (a==b)
          System.out.println(a+" and "+b+" are "+"same Characters");
          else 
          System.out.println(a+" and "+b+" are "+"different Characters");
    }
    
   public static void main (String[]args) {
       Scanner sc = new Scanner (System.in);

       System.out.println("Enter a number ");
       int num = sc.nextInt();
       System.out.println("Enter 's' for square root of the number or press any key for cube of the number ");
       char ch1 = sc.next().charAt(0);
       System.out.println("Enter 'a' ");
       int a = sc.nextInt();
       System.out.println("Enter 'b' ");
       int b = sc.nextInt();
       System.out.println("Enter 'p' for product of the numbers or press any key for sum of the numbers ");
       char ch2 = sc.next().charAt(0);
       System.out.println("Enter two characters");
       char char1 = sc.next().charAt(0);
       char char2 = sc.next().charAt(0);
       num_cal(num,ch1);
       num_cal(a,b,ch2);
       num_cal(char1,char2);
       sc.close();
   }
}