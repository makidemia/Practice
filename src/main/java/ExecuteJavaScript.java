import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExecuteJavaScript {


    public static void executeJS(WebDriver driver){
        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton= driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement closeButton= driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",closeButton); // execute this script on closebutton elemnet

    }
}
