package p1;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import p1.Factorial;

public class JunitTest {
	Factorial factorial = null;
	
	@Before
	public void firstMethod() {
		//System.out.println("Testing Started...");
		factorial = new Factorial();
	}
	
	@Test
	public void testFactWhenInputIsZero() {
		System.out.println("Testing: testFactWhenInputIsZero()");
		int actualValue=factorial.fact(0);
		assertEquals(1,actualValue);
	}
	
	@Test
	public void testFactWhenInputIsThree() {
		System.out.println("Testing: testFactWhenInputIsThree()");
		int actualValue=factorial.fact(3);
		assertEquals(6,actualValue);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testFactWhenInputIsNegative() {
		System.out.println("Testing: testFactWhenInputIsNegative()");
		int actualValue=factorial.fact(-5);
	}
	
	

}
