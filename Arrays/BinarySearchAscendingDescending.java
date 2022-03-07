package Arrays;

public class BinarySearchAscendingDescending {
       public static void main (String[]args) {
           int arr1[]={23,56,76,83,118}; //ascending
           int arr2[]={110,89,68,54,12};  // descending

            searchAscending(arr1,83);
            searchDescending(arr2,89);
       }

       public static void searchAscending(int arr[],int toS) {
         int ub=arr.length-1,lb=0,mb;
         int fn=-1; // found index
         while(lb<=ub){
            mb=(ub+lb)/2;
            if (arr[mb]==toS){
                 fn=mb;
                 break;   
            }
            else if (toS>arr[mb]){ 
                lb=mb+1;
            }
            else{
                ub=mb-1;
            }
         }  
         if (fn!=-1)
            System.out.println("Number of found at : "+fn+" index");
            else
            System.out.println("Number not found");

     }


     public static void searchDescending(int arr[],int toS) {

        int ub=arr.length-1,lb=0,mb;
         int fn=-1; // found index
         while(lb<=ub){
            mb=(ub+lb)/2;
            if (arr[mb]==toS){
                 fn=mb;
                 break;   
            }
            else if (arr[mb]>toS){
                lb=mb+1;
            }
            else{
                ub=mb-1;
            }
           
         }    

         if (fn!=-1)
         System.out.println("Number of found at : "+fn+" index");
         else
         System.out.println("Number not found");
     
    }

}

