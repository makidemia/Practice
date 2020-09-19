import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {

    public static void radioButtonCheck(WebDriver driver) throws InterruptedException {
        driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement radioByType= driver.findElement(By.cssSelector("input[type='radio'")); //type specified should be unique, here it is not
        radioByType.click();

        Thread.sleep(1000);

        WebElement radioByValue= driver.findElement(By.cssSelector("input[value='option3']"));
        radioByValue.click();
    }
}
