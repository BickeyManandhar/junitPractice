package p2;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

//Hey I am using Mockito JUNIT Runner
@RunWith(MockitoJUnitRunner.class)
public class TestMochaServiceClass {

	// it will create mock object of MathUtil
	@Mock
	private MathUtil mathUtil;

	// this annotation creates real object of MochaService and inject // mock
	// mathUtil inside it//MochaService mochaService=new MochaService();;
	@InjectMocks
	private MochaService mochaService;

	// The BeforeClass annotation indicates that the static method to which is
	// attached must be executed once and before all tests in the class.
	// That happens when the test methods share computationally expensive setup
	// (e.g. connect to database).

	@BeforeClass
	public static void onceExecutedBeforeAll() {
		System.out.println("@BeforeClass: onceExecutedBeforeAll");
	}

	@Before
	public void createObjectForEachClass() {
		MockitoAnnotations.openMocks(this);
	}

	@Test(expected = RuntimeException.class)
	public void testWhenInputIsNegative() {
		mochaService.calc(-2);
	}

	@Test
	public void testWhenInputIsFive() {
		when(mathUtil.randomNumberGenerator()).thenReturn(10);
		int result = mochaService.calc(5); // rand=10+10+(5*5)
		assertEquals(45,result);
		verify(mathUtil,times(1)).randomNumberGenerator();
		verifyNoMoreInteractions(mathUtil);
	}

	@Test
	public void testWhenInputIsTwo() {
		when(mathUtil.randomNumberGenerator()).thenReturn(5);
		int result = mochaService.calc(2); // rand=5+10+(2*2)
		assertEquals(19,result);
		verify(mathUtil,times(1)).randomNumberGenerator();
		verifyNoMoreInteractions(mathUtil);
	}
	
	@After
	public void doSomething() {
		System.out.println("Testing Completed...");
		
	}
}
