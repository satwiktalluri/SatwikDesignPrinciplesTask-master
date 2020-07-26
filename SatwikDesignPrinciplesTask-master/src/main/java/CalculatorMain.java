import static org.junit.Assert.*;
import org.junit.*;
public class CalculatorMain{   
    Calculator calculator;
     @Before
     public void objectCreation()
     {
    	calculator=new Calculator();
     }
	@Test
	public void test() throws Exception {
		assertEquals(8,calculator.computeAnswer(18, -10, "Addition"));
	}
	@Test
	public void test1() throws Exception {
		assertEquals(14,calculator.computeAnswer(7, 2, "Multiplication"));
	}
	@Test
	public void test2() throws Exception {
		assertEquals(-2,calculator.computeAnswer(2, 4, "Subtraction"));
	}
	@Test
	public void test3() throws Exception {
		assertEquals(2,calculator.computeAnswer(6, 3, "Division"));
	}

}