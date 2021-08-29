
//FIXME:
public class Rhombus {
     
    public static void main (String[]args) {
        int l=1;
        int var=0;
       for (int i=1;i<=5;i++){ 
        for (int j=1;j<=(5-i);j++)
            System.out.print(" ");
       
        for (l=1;l<=i+var;l++)
              System.out.print("*");
      
         var++;
         
            System.out.println(); 
       }
       System.out.println(l);

       for (int i=1;i<=4;i++){ 
       
        for (int j=1;j<=i;j++)
            System.out.print(" ");
       

        for (int k=1;k<=2*(5-i)-1;k-=2)
              System.out.print("*");
          
        
            System.out.println(); 
       }


   
   }
}

//    *      1
//   ***     2
//  *****    3
// *******   4
//*********  5
// *******   1
//  *****    2
//   ***     3
//    *      4