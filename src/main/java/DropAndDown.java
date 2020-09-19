import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DropAndDown {

    public static void dropNDown(WebDriver driver){
        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image= driver.findElement(By.id("image"));

        WebElement dropBox= driver.findElement(By.id("box"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(image,dropBox).build().perform();


    }
}
