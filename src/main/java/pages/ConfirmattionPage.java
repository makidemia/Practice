package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmattionPage {

    public  void waitForAlertBanner(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.
                visibilityOfElementLocated
                        (By.cssSelector(".alert.alert-success")));
    }

    public  String getAlertBanner(WebDriver driver) {
        return driver.findElement(By.cssSelector(".alert.alert-success")).getText();
    }
}
