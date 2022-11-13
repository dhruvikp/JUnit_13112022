import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class CCalculatorTest {

	Calculator c;

	@BeforeEach
	public void init() {
		c = new Calculator();
	}
	
	@Test
	public void test_calculate_when_both_args_positive() {
		// STEP 1: Prepare inputs
		int a = 1;
		int b = 1;
		
		// STEP 2: Get Actual Value
		int actual = c.calculate(a, b);
		
		
		// STEP 3: Prepare Expected Value
		int expected = 2;
		
		// STEP 4: Assert actual and expected
		Assertions.assertEquals(expected, actual);
	}
	
	
}
