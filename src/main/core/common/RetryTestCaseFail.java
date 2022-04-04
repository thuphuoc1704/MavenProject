package common;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTestCaseFail implements IRetryAnalyzer {
	private int retryCount = 0;
	private int retryMaxCount = 2;

	public boolean retry(ITestResult result) {
		if (retryCount < retryMaxCount) {
			System.out.println("Retry testcase name:" + result.getName() + " with: " + (retryCount + 1) + " time(s)");
			retryCount++;
			return true;
		}

		return false;

	}
}
