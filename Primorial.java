public class Primorial {
    public static void main (String[]args) {
    int j=1,primorial=1,c=0,num=5;
     for(int i=num;i>1;i--) {
              c=0;
          for (j=1;j<=i;j++){    
             if (i%j==0)  
                c++;     
         }
         if (c==2) 
                primorial*=i;  
     }
    System.out.println(primorial); 
       }
}