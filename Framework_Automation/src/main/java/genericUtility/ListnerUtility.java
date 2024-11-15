package genericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;

public class ListnerUtility extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		ExtentTest etest = extReport.createTest(result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		extReport
	}

	
	
       
}
