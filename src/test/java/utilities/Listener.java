package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.BaseTest;

public class Listener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test class is started : " + result.getTestName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed : "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed : "+ result.getMethod().getConstructorOrMethod().getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Failed within success percentage "+result.getMethod().getConstructorOrMethod().getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test class is instantiated "+context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test finished "+context.getName());
    }

}
