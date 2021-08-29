public class wallisFormula {
    public static void main (String[]args){
             int p=1;
             double piby2=1;
             double two=2;
             double three=3;
             while (true) {
             piby2*=(two/p)*(two/three);
             two+=2;
             three+=2;
             p+=2;
         
             System.out.print((piby2)*2); 
    }
   
    }
}
