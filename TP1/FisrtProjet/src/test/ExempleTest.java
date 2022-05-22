package test;

import junit.framework.TestCase;

public class ExempleTest extends TestCase{
	
	
	public void testExempleNormal() {
		Exemple e = new Exemple(2, 6);
		assertEquals(8, e.calculer());
	}
	
	public void testExempleCas1() {
		Exemple e = new Exemple(0, 6);
		assertEquals(12, e.calculer());
	}
	
	public void testExempleCas2() {
		Exemple e = new Exemple(2, 0);
		assertEquals(4, e.calculer());
	}
	
	public void testExempleCas3() {
		Exemple e = new Exemple(0, 0);
		assertEquals(0, e.calculer());
	}
	
	
	
}
