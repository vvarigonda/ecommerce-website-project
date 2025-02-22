package main.java.Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

// This  method retries running the failed test case
public class RetryAnalyser implements IRetryAnalyzer {
int count = 0;
int retryCount = 0;
    @Override
    public boolean retry(ITestResult iTestResult) {
        while(count<retryCount)
        {
            count++;
            return true;
        }
        return false;
    }
}
