
public class Tech_Number {
// if the given number has an even number of digits 
// and the number can be divided exactly into two parts from the middle. 
//  After equally dividing the number, sum up the numbers and find the square of the sum
// Find all 4-digit tech numbers


   public static void FindNums () {
        for (int i=1000;i<=9999;i++){ // all 4 digits nums

          int firsth = i/100;
          int lasth = i%100;
          int sum = firsth+lasth;
          int square = sum*sum;
           if (square==i)
              System.out.print(i+" ");
        }
   }
   public static void main (String[]args) {
         FindNums();
   }
}