import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ERepeatedTest {

	Calculator c ;
	
	@BeforeEach
	public void init() {
		c = new Calculator();
	}
	
	@Test
	@RepeatedTest(100)
	public void test() {
		Assertions.assertEquals(2, c.calculate(1, 1));
	}
}
