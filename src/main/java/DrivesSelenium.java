
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrivesSelenium {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/mahekomshree/Documents/MKdocs/Practice/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        //AutoComplete.autoComplete(driver);
        //Scroll.scroll(driver);
       // WindowSwitch.windowSwitch(driver);

        //AlertCheck.alertCheck(driver);

        //ExecuteJavaScript.executeJS(driver);
       // DropAndDown.dropNDown(driver);
      //  RadioButton.radioButtonCheck(driver);
     //   CssSelector.cssCheck(driver);
      // ImplicitWaitCheck.implicitCheck(driver);
      //  ExplicitWait.explicitCheck(driver);
       // Form.submitForm(driver);
        FormModify.form(driver);
        Thread.sleep(10000);
        driver.quit();
    }
}
