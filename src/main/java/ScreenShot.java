import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.io.File;

public class ScreenShot {

    public static void takeSS(WebDriver driver) {

        driver.get("https://formy-project.herokuapp.com/keypress");

        TakesScreenshot ss = (TakesScreenshot) driver;
        ss.getScreenshotAs(OutputType.FILE);
    }

    public static void checkMyTextPrest(WebDriver driver){

        driver.get("https://formy-project.herokuapp.com/keypress");

      driver.getPageSource().contains("my text");
    }

    // It will execute after every test execution
   /* @AfterMethod
    public void tearDown(ITestResult result) {

        // Here will compare if test is failing then only it will enter into if condition
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                // Create refernce of TakesScreenshot
                TakesScreenshot ts = (TakesScreenshot) driver;

                // Call method to capture screenshot
                File source = ts.getScreenshotAs(OutputType.FILE);

                // Copy files to specific location here it will save all screenshot in our project home directory and
                // result.getName() will return name of test case so that screenshot name will be same
                FileUtils.copyFile(source, new File("./Screenshots/" + result.getName() + ".png"));

                System.out.println("Screenshot taken");
            } catch (Exception e) {

                System.out.println("Exception while taking screenshot " + e.getMessage());
            }*/
}