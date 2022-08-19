package Utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;

import TestCases.BaseClass;

public class MyListener extends BaseClass implements ITestListener {
	public void onTestFailure(ITestResult result) {
		String filepath = null;
		System.out.println("Test Failed, screenshot captured as " + result.getMethod().getMethodName());
		try {
			filepath = (String) screenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extentTest.fail("Method " + result.getName() + "is failed \n screent is captured  ");
		extentTest.fail(MediaEntityBuilder.createScreenCaptureFromPath(filepath).build());
		extentTest.addScreenCaptureFromPath(filepath,"failed screen shot");

		System.out.println("Method " + result.getName() + " from " + result.getInstanceName() + " is FAILED");

	}

	public void onTestStart(ITestResult result) {
		String methodName=result.getName(),instance=result.getInstanceName();
		System.out.println("Started execution of method " + methodName + " from " + instance);
		extentTest.pass("Started execution of method " + methodName + " from " + instance);

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Method " + result.getName() + " from " + result.getInstanceName() + " is PASSED");
		extentTest.pass("Method " + result.getName() + " from " + result.getInstanceName() + " is PASSED");

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Method " + result.getName() + " from " + result.getInstanceName() + " is SKIPPED");
		extentTest.warning("Method " + result.getName() + " from " + result.getInstanceName() + " is SKIPPED ");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Method " + context.getName() + " is finished");
		extentTest.pass("Method " + context.getName() + " is finished");
	}

}
