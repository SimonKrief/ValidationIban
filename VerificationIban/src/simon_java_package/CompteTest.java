package simon_java_package;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompteTest {
	Compte compte= new Compte();

	@Test
	public void testLongueur23() {
		compte.setIban("000000000000000000000ZX");
		assertTrue(compte.longueur23());
		compte.setIban("00000000000000000000ZX");
		assertFalse(compte.longueur23());
		compte.setIban("12345123451234567891A16");
		assertTrue(compte.longueur23());
	}

	@Test
	public void testConversion() {

	}

	@Test
	public void testMod97() {
		compte.setIban("000000000000000000000ZX");
		assertTrue(compte.Mod97());
		compte.setIban("12345123451234567891A16");
		assertTrue(compte.Mod97());
		compte.setIban("12345123451234567891A17");
		assertFalse(compte.Mod97());

	}

}
