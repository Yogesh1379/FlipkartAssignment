package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListener extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("test is straeted");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("test is executed" );
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Reporter.log("Test is failed screenshot has been taken", true);
		failed(methodName);
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test is skiped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	

}
