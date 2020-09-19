import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardAndMouse {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/mahekomshree/Documents/MKdocs/Practice/Selenium/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement webElement= driver.findElement(By.id("name"));
        webElement.click();
        webElement.sendKeys("Mahek Omshree");

        WebElement buttonClickEnter= driver.findElement(By.id("button"));
        buttonClickEnter.click();

        driver.quit();

    }
}
