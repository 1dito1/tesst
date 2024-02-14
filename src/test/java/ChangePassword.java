import Browser.OpenChromeWithoutLogin;
import StepsTo.LogIn;
import StepsTo.ResetPassword;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import DataObject.LogInData.*;
import static Browser.OpenChromeWithoutLogin.driver;

import static DataObject.LogInData.*;
public class ChangePassword extends OpenChromeWithoutLogin {

    @Test
    public void InputInvallidCredentials() {

        ResetPassword step1 = new ResetPassword(driver);
        step1.clickResetPass();
        step1.fillEmail(correctUsername);
        step1.clickResetButton();
        String
                expectedResult = "Password reset email has been sent.",
                actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);
        softAssert.assertAll();
        System.out.println("expeected: " + expectedResult);
        System.out.println("actual: " + actualResult);
    }
    @AfterTest
    public void closeChrome(){

        driver.close();
    }
}
