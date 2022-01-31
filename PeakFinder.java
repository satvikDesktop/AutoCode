import java.util.Scanner;
 
public class PeakFinder {

  public static void findPeak(int array[], int len) {
    int peak[] = new int[len];
    for (int i = 1, j = 0; i < (array.length - 1); i++) { // 1 to 1 less than the length of the array
      if (array[i] > array[i + 1] &&  array[i] > array[i - 1] ) {
        peak[j] = array[i];
        j++;
      }
      if (array[0] > array[1] ) {
        int peakStart = array[0];
        System.out.println(peakStart);
      }
    }
    for (int k = 0; k < peak.length; k++) {
       if (peak[k]!=0) 
        System.out.println(peak[k]); 
      }

      if (array[array.length-1] > array[array.length -2]) {
        int peakEnd = array[array.length-1];
        System.out.println(peakEnd);
      }
  } 

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number of elements in an array");
    int len = sc.nextInt();
    int array[] = new int[len];
    System.out.println("Enter elements");
    for (int i = 0; i < len; i++) {
      array[i] = sc.nextInt();
    }

     findPeak(array, len);

     sc.close();
  }

}
