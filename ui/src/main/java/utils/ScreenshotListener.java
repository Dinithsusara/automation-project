package utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        capture(result, "PASS");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        capture(result, "FAIL");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        capture(result, "SKIPPED");
    }

    private void capture(ITestResult result, String status) {
        Object testClass = result.getInstance();
        WebDriver driver = null;

        try {
            Class<?> clazz = testClass.getClass();
            while (clazz != null) {
                try {
                    var field = clazz.getDeclaredField("driver");
                    field.setAccessible(true); // Allow access to private fields
                    driver = (WebDriver) field.get(testClass);
                    break;
                } catch (NoSuchFieldException e) {
                    clazz = clazz.getSuperclass(); // Check superclass if not found
                }
            }

            if (driver != null) {
                String testName = result.getMethod().getMethodName();
                ScreenshotUtil.takeScreenshot(driver, status + "_" + testName);
            } else {
                System.err.println("❌ ScreenshotListener error: WebDriver 'driver' field not found in test class hierarchy");
            }

        } catch (Exception e) {
            System.err.println("❌ ScreenshotListener error: " + e.getMessage());
        }
    }
}
