package utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass extends BaseClass implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		
	}
	
	public void onTestSuccess(ITestResult result)
	{
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		Screenshot.captureScreenshot("Capture", driver);
	}
	public void onTestSkipped(ITestResult result)
	{
		
	}
	

}
