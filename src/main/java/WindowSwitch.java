import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowSwitch {
    public static void windowSwitch(WebDriver driver) throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement window = driver.findElement(By.id("new-tab-button"));
        window.click();

        String originalWindow = driver.getWindowHandle();

        for (String handle : driver.getWindowHandles()) { //to itterate over different windows
            driver.switchTo().window(handle);
        }
        Thread.sleep(1000);
        driver.switchTo().window(originalWindow);
        Thread.sleep(1000);

    }
}
