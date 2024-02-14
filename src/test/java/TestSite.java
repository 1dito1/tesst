import Browser.OpenChrome;
import StepsTo.LogIn;
import StepsTo.EditAccount;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static DataObject.LogInData.*;

public class TestSite extends OpenChrome {
    @Test (priority = 1)
    public void logInWithCorrDataAndSignOut(){
        LogIn step1 = new LogIn(driver);

//
        String
                expectedResult = "Hello dito18 (not dito18? Sign out)",
                actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/p[1]")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);
        softAssert.assertAll();
        System.out.println("actual result is " + actualResult);
        System.out.println("expected result is " + expectedResult);
        EditAccount step2 = new EditAccount(driver);

        step2.clickAccDetails();
        step2.clickSaveChanges();
        String
                expectedResult3 = "First Name is a required field.",
                actualResult3 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/ul/li[1]")).getText();

        softAssert.assertEquals(actualResult3, expectedResult3);
        System.out.println("actual result is " + actualResult3);
        System.out.println("expected result is " + expectedResult3);


        step1.clickLogout();
        String
                expectedResult2 = "Remember me",
                actualResult2 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/form/p[3]/label")).getText();
        Assert.assertEquals(actualResult2,expectedResult2);
        System.out.println("actual result is " + actualResult2);
        System.out.println("expected result is " + expectedResult2);

    }

}
