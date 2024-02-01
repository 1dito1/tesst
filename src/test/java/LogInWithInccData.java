import StepsTo.LogIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import DataObject.LogInData.*;

import static Browser.OpenChrome.driver;
import static DataObject.LogInData.*;

public class LogInWithInccData {
    @BeforeTest
    public void openBrowser(){
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/my-account/");

    }
    @Test
    public void InputInvallidCredentials(){

            LogIn step1 = new LogIn(driver);
            step1.fillUsername(incorUsername);
            step1.fillPassword(incorPassword);
            step1.clickSubmit();
                String
                expectedResult = "Error: The username ditodito is not registered on this site. If you are unsure of your username, try your email address instead.)",
                actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/ul/li")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);
        softAssert.assertAll();





    }
    @AfterTest
    public void closeChrome(){

        driver.close();
    }

}
