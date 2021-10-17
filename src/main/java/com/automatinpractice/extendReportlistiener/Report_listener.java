package com.automatinpractice.extendReportlistiener;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.automatinpractice.extendReportlistiener.ExtendLogger;
import com.automatinpractice.extendReportlistiener.ExtendReport;

public class Report_listener implements ITestListener,ISuiteListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		ExtendReport.createTest(result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		ExtendLogger.pass(result.getName()+"Is passed Sucessfully");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		ExtendLogger.fail(result.getName()+"is failed miserably");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		ExtendLogger.skip(result.getName()+"is skipped");
	}
	
	@Override
	public void onStart(ISuite suite) {
		ExtendReport.startReport();
	}
	
	
	@Override
	public void onFinish(ISuite suite) {
		ExtendReport.endReport();
	}
}
