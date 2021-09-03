
public class SymbolPattern {

      public static void StringMethod(){ 
          String line1="A@?>=";
          int initLineLength=line1.length();  //initial string length
          for (int i=0;i<initLineLength;i++){
             
             System.out.println(line1);
            line1 = line1.substring(0, line1.length() - 1); // removes last character
          }
      }

      public static void ArrayMethod(){ 
         char[] line1 = new char[]{ 'A','@','?','>','='};  // originalcharacters
         int initLineLength=line1.length; // initial array length
         
        for (int i=0;i<initLineLength;i++){
              
        }
      }
     
  
   public static void main (String[]args) {
     
     StringMethod();
     ArrayMethod();
      
   }
}