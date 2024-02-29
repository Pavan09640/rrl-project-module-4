package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("** Test Started : " +result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("** Test success : " +result.getName());
	}

	public void onTestFailure(ITestResult result) {
		captureScreenshot(result.getMethod().getMethodName());
		
	}

	private void captureScreenshot(String methodName) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("** Test skipped : " +result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	}

	public void onFinish(ITestContext context) {
		System.out.println("** Test completed : " +context.getName());
	}
	}