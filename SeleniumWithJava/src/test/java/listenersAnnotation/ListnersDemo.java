package listenersAnnotation;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println(result.getName()+"Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println(result.getName()+"Test has executed successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println(result.getName()+"Test has Failed");
	}

}
