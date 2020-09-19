import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
 // when we need to scroll down to fill an entry
    public static void scroll(WebDriver driver) throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name=driver.findElement(By.id("name"));
        Actions actions=new Actions(driver);
        //to move to tthe particular field for testing following thee page
        actions.moveToElement(name);
        name.sendKeys("mahek oms");

        WebElement date= driver.findElement(By.id("date"));
        date.sendKeys("01/01/2020");

    }
}
