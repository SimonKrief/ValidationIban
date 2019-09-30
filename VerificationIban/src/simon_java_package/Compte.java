package simon_java_package;

import java.math.BigInteger;
import java.util.Iterator;



public class Compte {
	String iban;
	
	public String getIban() {
		return iban;
	}

	public void setIban(String leGrandNombreEnEntree) {
		iban = leGrandNombreEnEntree;
	}

	public boolean longueur23() {
		if(iban.length()!= 23) {
			return false;
		}else {
			return true;	

		}
	}
	
	public BigInteger conversion() {
		String ibanChiffre = "";
		for (int i = 0; i < iban.length(); i++){
		    char c = iban.charAt(i); 
		    switch (c) {
			case 'X': case 'P': case 'G':
				ibanChiffre+="7";
				break;
			case 'Z': case 'R': case 'I':
				ibanChiffre+="9";
				break;
			case 'Y': case 'Q': case 'H':
				ibanChiffre+="8";
				break;
			case 'W': case 'O': case 'F':
				ibanChiffre+="6";
				break;
			case 'V': case 'N': case 'E':
				ibanChiffre+="5";
				break;
			case 'U': case 'M': case 'D':
				ibanChiffre+="4";
				break;
			case 'T': case 'L': case 'C':
				ibanChiffre+="3";
				break;
			case 'S': case 'K': case 'B':
				ibanChiffre+="2";
				break;
			case 'J': case 'A': 
				ibanChiffre+="1";
				break;
			default:
				ibanChiffre+= c;
				break;
				//throw new IllegalArgumentException("Unexpected value: " + c);
			}
		}
		//System.out.println(ibanChiffre);
		BigInteger n = new BigInteger(ibanChiffre);
		return n;
		
//		for (int i = 0; i < iban.length(); i++){
//		    char c = iban.charAt(i); 
//		    switch (c) {
//			case 'X':
//				iban.replace(c, (char) 7);
//				//break type;
//			case 'Z':
//				iban.replace(c, (char) 9);
//			default:
//				ibanChiffre+= c;
//				throw new IllegalArgumentException("Unexpected value: " + c);
//			}
//		}
//		iban.replace('X',  '7');
//		iban.replace('Z', (char) 9);
//		System.out.println(iban);
		
		
		
	}
	
	public boolean Mod97() {
		BigInteger quatrevingdixsept = new BigInteger("97");
		BigInteger n = this.conversion().mod(quatrevingdixsept);
		System.out.println(n);
		if (n.intValue()==0) {
			return true;
		} else {
			return false;
		}
		
	}

}
