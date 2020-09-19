import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertCheck {


    public static void alertCheck(WebDriver driver){
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alert= driver.findElement(By.id("alert-button"));
        alert.click();

          Alert popupButton=  driver.switchTo().alert();
          popupButton.accept();

    }
}
