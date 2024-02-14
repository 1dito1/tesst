import Browser.OpenChrome;
import Browser.OpenChromeWithoutLogin;
import StepsTo.Registration;
import StepsTo.selectOption;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static Browser.OpenChromeWithoutLogin.driver;
import static DataObject.RegistrationData.regEmail;
import static DataObject.RegistrationData.regPassword;
import static PageObject.RegistrationObject.regButton;
import java.time.Duration;

import java.time.Duration;

import DataObject.RegistrationData.*;
public class AddToCart extends OpenChrome {

    @Test
    public void addProduct() throws InterruptedException {
        selectOption step1 = new selectOption(driver);
        step1.clickDownloadButton();
        step1.clickShopButton();
        step1.addToCart();
        String
                expectedResult = "3 item",
                actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[6]/a/span[1]")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);
        softAssert.assertAll();
        System.out.println("expeected: " + expectedResult);
        System.out.println("actual: " + actualResult);

    }





}
