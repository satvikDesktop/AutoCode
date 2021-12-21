
/*
Write a program by using a class with the following specifications:
Data members/instance variables:
int a
int b
 Member functions:
 Hcflcm(int x, int y) — constructor to initialize a=x and b=y.
void calculate( ) — to find and print hcf and lcm of both the number
*/

public class hcf_lcm {
    int a;
    int b;
   hcf_lcm(int x , int y){
         a = x ;
         b = y;
   }
   void calculate (){
       int hcf=1;
       for (int i=1;i<=Math.min(a,b);i++){
            if (a%i ==0 && b%i==0)
                 hcf=i;
       }
        System.out.println(hcf);
   }
   public static void main (String[]args){
        hcf_lcm ob = new hcf_lcm(24,18);
        ob.calculate();
   }

}
