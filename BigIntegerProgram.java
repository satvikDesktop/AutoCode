import java.math.BigInteger;
public class BigIntegerProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger A = new BigInteger("1");   // your number to be  checked
		System.out.println("value choosen :"+A);
		BigInteger temp = A;
		
		BigInteger digit =new BigInteger ("0");
		int co=0,ten=10;
		 BigInteger sum= new BigInteger("0");
		 for (;(A.compareTo(BigInteger.valueOf(co)) != 0);A=A.divide(BigInteger.valueOf(ten))) {    
			 digit=A.remainder(BigInteger.valueOf(ten));
			 int k=1; 
			 BigInteger  fac =new BigInteger ("1");
		         for (; (digit.compareTo(BigInteger.valueOf(k))>= 0);k++) {
		    	    fac = fac.multiply(BigInteger.valueOf(k));
		      }
		       sum=fac.add(sum);
		 }
		    if (sum.compareTo(temp) == 0) 
		    	System.out.println("Special Number ");
		    else 
		    	System.out.println("Not a Special Number ");
	}

}
