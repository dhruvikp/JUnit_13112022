import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ALifeCycleTest {

	@BeforeAll
	public static void initAll() {
		System.out.println("Before All method invoked");
	}

	@BeforeEach
	public void init() {
		System.out.println("Before Each method invoked!");
	}

	@Test
	public void test1() {
		System.out.println("Test1 executed");
	}

	@Test
	public void test2() {
		System.out.println("Test2 executed");
	}

	@AfterEach
	public void destroy() {
		System.out.println("After Each method is invoked!");
	}

	@AfterAll
	public static void destroyAll() {
		System.out.println("After All method invoked");
	}

}
