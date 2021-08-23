/*1. A password must have at least eight characters.                                             
2. A password consists of only letters and digits.                                         
3. A password must contain at least two digits */

import java.util.Scanner;
public class PasswordChecker {

	public static void main(String[] args) {
		  Scanner sc = new Scanner (System.in);
      System.out.println();
      System.out.println("RULES : ");
      System.out.println("A password must have at least eight characters");
      System.out.println("A password consists of only letters and digit");
      System.out.println("A password must contain at least two digits");
      System.out.println();
		  System.out.println("Enter the password");
		  String pW = sc.nextLine();
		  if (CheckValidity(pW)==false)  
		  System.out.println("Password invalid");
		  else 
      System.out.println("Password accepted");
		  sc.close();
       
	}
	
	public static boolean CheckValidity(String pW) {
		 boolean LDcheck=false,Dcheck=false;
    int wholeCheck=0,digits=0;
		  for (int i=0;i<pW.length();i++) {
			  int intValChar = pW.charAt(i);
			 if ((intValChar >= 48 &&  intValChar <= 57)||(intValChar >= 65 &&  intValChar <= 90 )||(intValChar >= 97 &&  intValChar <= 122 )) {
				      wholeCheck++;
			 }
       if ((intValChar >= 48 &&  intValChar <= 57)){
          digits++;
       }
		  }
      if (digits>=2)
         Dcheck=true; 
		  if (wholeCheck==pW.length())
         LDcheck=true;

		  
		 if ( pW.length()>=8 && LDcheck==true && Dcheck == true)
			 return true;
		 else 
			 return false;
		
	}

}
