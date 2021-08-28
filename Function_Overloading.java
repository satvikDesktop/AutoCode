
public class Function_Overloading {

    public static void num_cal(int num, char ch){   
          if (ch=='s')
          System.out.println(num*num);
          else
          System.out.println(num*num*num);
    }
    public static void num_cal(int a,int b, char ch){
        if (ch=='p')
        System.out.println(a*b);
        else
        System.out.println(a+b);  
    }
    public static void num_cal(char a, char b){
          if (a==b)
          System.out.println("Same Characters");
          else 
          System.out.println("Different Characters");
    }
    
   public static void main (String[]args) {
    
       num_cal(4,'s');
       num_cal(5,6,'p');
       num_cal('c','c');
 
   }
}