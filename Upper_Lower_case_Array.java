import java.util.Scanner;
public class Upper_Lower_case_Array {
   public static void main (String[]args) {

      Scanner sc = new Scanner(System.in);
      char arr[]=new char[10];
      int cv=0;
      int cU=0;

      for (int i=0;i<10;i++){
          arr[i]=sc.next().charAt(0);
      }
      
      for (int i=0;i<10;i++){

      if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
      cv++;
      if ((int)arr[i]>=65 && (int)arr[i]<=90 )
      cU++;

      }

      System.out.println("vowels : "+cv);
      System.out.println("uppercase : "+cU);

      sc.close();  
   }
}  