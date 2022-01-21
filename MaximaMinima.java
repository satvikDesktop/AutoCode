import java.util.Scanner;
public class MaximaMinima {

    static Scanner sc = new Scanner(System.in);
    static int count = sc.nextInt();
    static int arr [] = new int [count] ;
    
        
     public static int max(){
         int temp ;
        for (int i = 0; i < count; i++)   
        {  
            for (int j = i + 1; j < count; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
       return arr[count-1];  
}  

  

    public static int min() {
        int temp ;
        for (int i = 0; i < count; i++)   
        {  
            for (int j = i + 1; j < count; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
       return arr[0]; 
    }



    public static void main (String[]args) {
        System.out.println("ENTER ARRAY ELEMENTS ");
        for (int i=0;i<count;i++) {
            arr[i]=sc.nextInt();
        }
      
        System.out.println("MAXIMUM : "+max()); 
        System.out.println("MINIMUM : "+min());
          
       }

    }

