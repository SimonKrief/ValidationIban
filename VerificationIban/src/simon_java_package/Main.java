package simon_java_package;

import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		Compte compte= new Compte();
		compte.setIban("000000000000000000000ZX");
		System.out.println(compte.iban);
		compte.conversion();
		//System.out.println(compte.iban);
        BigInteger b1, b2; 
        
        b1 = new BigInteger("321456"); 
        b2 = new BigInteger("31711"); 
  
        // apply mod() method 
        BigInteger result = b1.mod(b2); 
  
        // print result 
        System.out.println("Result of mod  operation between " + b1 
                 + " and " + b2 + 
                 " equal to " + result); 
	}
	

}
