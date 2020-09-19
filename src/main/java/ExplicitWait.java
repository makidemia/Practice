import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

    public static void explicitCheck(WebDriver driver) {

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("582,Katju Nagar Main Road");

        //define wait instance, which consist river and timeout sec
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // wait for the Webelemnt
        //wait until the expectedcondition can be visibility of the elment with By locator class name  can be use
        WebElement autoCompleteSelect = wait
                .until(ExpectedConditions
                                .visibilityOfElementLocated
                                        (By.className("pac-item")));
        autoCompleteSelect.click();
    }
}
