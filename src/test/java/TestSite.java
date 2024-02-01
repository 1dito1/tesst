import Browser.OpenChrome;
import StepsTo.LogIn;
import StepsTo.EditAccount;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static DataObject.LogInData.*;

public class TestSite extends OpenChrome {
    @Test (priority = 1)
    public void logInWithCorrData(){
        LogIn step1 = new LogIn(driver);
        step1.fillUsername(correctUsername);
        step1.fillPassword(correctPassword);
        step1.clickSubmit();
//
        String
                expectedResult = "Hello dito18 (not dito18? Sign out)",
                actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/p[1]")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);
        softAssert.assertAll();
        System.out.println("actual result is " + actualResult);
        System.out.println("expected result is " + expectedResult);
    }

    @Test(priority = 2)
    public void signOut(){
        LogIn step1 = new LogIn(driver);
//        step1.fillUsername(correctUsername);
//        step1.fillPassword(correctPassword);
//        step1.clickSubmit();
        step1.clickLogout();
        String
                expectedResult = "Remember me",
                actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/form/p[3]/label")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);
        softAssert.assertAll();
        System.out.println("actual result is " + actualResult);
        System.out.println("expected result is " + expectedResult);
    }

    @Test(priority = 3)
    public void saveChanges(){
        EditAccount step1 = new EditAccount(driver);

        step1.fillUsername(correctUsername);
        step1.fillPassword(correctPassword);
        step1.clickSubmit();
        step1.clickAccDetails();
        step1.clickSaveChanges();



    }

}
