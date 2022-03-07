package Patterns;
public class SpaceDecreasingDash {
    public static void main (String[]args) {
        int i,j=1,k;
      for (i=1;i<=4;i++){
          for (k=1;k<=(i-1);k++){
           System.out.print("_");
          }
          for (;j<=i;j++){
            System.out.print(j);
           }
           System.out.println();
      }
   }
}