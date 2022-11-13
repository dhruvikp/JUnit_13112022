import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class FDependencyInjTest {

	@Test
	@DisplayName("THis is JUnit Test")
	public void test1(TestInfo testInfo, TestReporter reporter) {
		reporter.publishEntry("Test Name :", testInfo.getDisplayName());
	}
}
