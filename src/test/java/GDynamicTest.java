import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class GDynamicTest {

	Calculator c;

	@BeforeEach
	public void init() {
		c = new Calculator();
	}

	@TestFactory
	public Collection<DynamicTest> dynamicTests() {
		Collection<DynamicTest> tests = new ArrayList<DynamicTest>();
		tests.add(DynamicTest.dynamicTest("When both arg positive", () -> {
			Assertions.assertEquals(2, c.calculate(1, 1));
		}));
		tests.add(DynamicTest.dynamicTest("When one arg pos, and another neg", () -> {
			Assertions.assertEquals(0, c.calculate(1, -1));
		}));
		tests.add(DynamicTest.dynamicTest("When both arg negative", () -> {
			Assertions.assertEquals(-2, c.calculate(-1, -1));
		}));
		return tests;
	}
}
