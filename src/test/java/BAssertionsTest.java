import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class BAssertionsTest {

	@Test
	void test() {
		int actual = 1;
		int expected = 1;
		
		Assertions.assertEquals(expected, actual);
		
		Assertions.assertNotEquals(1, 2);
		Assertions.assertTrue(1==1);
		
		String str= null;
		Assertions.assertNull(str);
		
		int[] arr1 = {1,1};
		int[] arr2 = {1,1};
		
		Assertions.assertArrayEquals(arr1, arr2);

		
	}
}