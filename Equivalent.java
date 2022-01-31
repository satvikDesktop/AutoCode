

    //   Given below is a class with the following specifications
    //   Class Name: Equivalent
    //   Data members: int n – to store first number
    //   int m – to store the second number
      
    //   Member methods:
    //   1. A parameterised constructor to initialise values to member
    //   variables.
    //   2. int sumFactor(int num)- to return factors sum excluding
    //   number as its factor.
    //   3. check()- A function to check whether number is an equivalent
    //   number or not.
      
    //   Equivalent numbers are numbers where the factors sum(other than the
    //   number itself) are identical.Ex 159 and 559 are equivalent numbers
    //   since their factors sum is same.
    //   159=1,3 and 53= 1+3+53=57
    //   559=1,13 and 43=1+13+43=57

import java.util.Scanner;
public class Equivalent {
  int n;
  int m;
  Equivalent(int n , int m){
      this.n=n;
      this.m=m;
  }
  int sumFactor(int num){
      int sum=0;
        for (int i=1;i<n;i++){
                sum+=i;
        }
        return sum;
  }
  void check(){
    if (sumFactor(m)==sumFactor(n))
    System.out.println("Equivalent");
    else
    System.out.println("Not Equivalent");
  }
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
      Equivalent ob = new Equivalent(n,m);
      ob.sumFactor(n);
      ob.sumFactor(m);
      ob.check();
      sc.close();
  }
}
