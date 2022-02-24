
public class BinarySearchQues {
   public static void main (String[]args) {
    System.out.println(isElement()); 
   }
   public static boolean isElement() {

      int numList[]={5,7,9,11,15,20,30,45,89,97};
      int toSearch=16;
      int uB=numList.length-1,lB=0,mB;
      boolean flag=false;

     while(lB<=uB)
     {
      mB = (uB+lB)/2;

      if (numList[mB]==toSearch){
        flag=true;
        break;  // !important
      }
      else if (toSearch>numList[mB])
        lB=mB+1;
      
      else 
        uB=mB-1;

     }

    return flag;

   }
}
