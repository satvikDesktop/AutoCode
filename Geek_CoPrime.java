//not fast
public class Geek_CoPrime {
   public static void main (String[]args) {
     System.out.println(sum(3L,3L));
   }
   public static long sum(long N, long M){

     long fac=0;
  
    for (long i=1;i<=(Math.max(M,N));i++){ // sqrt for efficiency
        if (N%i==0 && M%i==0)   // checks if `i` is factor of `M and N` or not
        fac=i;     
    }
    long sum=(N/fac)+(M/fac);
        
    return sum;
}

}
