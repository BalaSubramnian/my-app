package in.gov.isro;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testcals {

	@Test
	public void testAdd() {
		calculator calc = new calculator();
		int result = calc.add(5, 5);
		assertEquals(10, result);		
	}
	
	@Test
	public void testMul(){
		calculator calc = new calculator();
		int result = calc.multiply(5, 5);
		assertEquals(25, result);
	}
	
	@Test
	public void testSub(){
		calculator calc = new calculator();
		int result = calc.substract(10, 5);
		assertEquals(5, result);
	}
	@Test
	public void testDiv(){
		calculator calc = new calculator();
		int result = calc.divide(10, 5);
		assertEquals(2, result);
	}
}
