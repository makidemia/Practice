import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssSelector {

    public static void cssCheck(WebDriver driver) throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/buttons");

        WebElement successButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-success"));
        successButton.click();
        Thread.sleep(100);

        WebElement infoButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-info"));
        infoButton.click();
        Thread.sleep(100);

        WebElement warningButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-warning"));
        warningButton.click();
    }
}
