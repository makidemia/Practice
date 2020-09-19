import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitCheck {

    public static void implicitCheck(WebDriver driver)  {

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("582,Katju Nagar Main Road");

        //replacing sleep

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement autoCompleteSelect = driver.findElement(By.className("pac-item"));
        autoCompleteSelect.click();
    }


}
