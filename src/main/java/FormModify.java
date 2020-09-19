import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.ConfirmattionPage;
import pages.FormPage;


public class FormModify {

    public static void form(WebDriver driver) {
        driver.get("https://formy-project.herokuapp.com/form");
        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmattionPage confirmattionPage=new ConfirmattionPage();
        confirmattionPage.waitForAlertBanner(driver);
        Assert.assertEquals("The form was successfully submitted!", confirmattionPage.getAlertBanner(driver));
    }

}
