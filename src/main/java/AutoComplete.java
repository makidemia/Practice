import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoComplete {

    public static void autoComplete(WebDriver driver) throws InterruptedException {

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("582,Katju Nagar Main Road");
        Thread.sleep(1000);

        WebElement autoCompleteSelect = driver.findElement(By.className("pac-item"));
        autoCompleteSelect.click();
    }
}
