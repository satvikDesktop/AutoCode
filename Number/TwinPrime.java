package Number;

public class TwinPrime {

    public static void Driver( ) {
      boolean isPrime=false;
      int i,k,factorC1=0,factorC2=0;

        for ( i=1;i<=100;i++){
             k=1;
             isPrime=false;
             factorC1=0;
             factorC2=0;
            for (k=1;k<=100;k++){
               if (i%k==0){
                 factorC1++;
               }
               if (factorC1++==2){
                for (k=1;k<=100;k++){
                    if ((i+2)%k==0){
                      factorC2++;
                    } 
                    if (factorC2==2)
                     isPrime=true;
               }
            }
                
        }
        if (isPrime==true)
          System.out.println(i+","+(i+2));
    }
    
}
   public static void main (String[]args) {
       Driver();
    }
}