import Browser.OpenChrome;
import PageObject.OderPage;
import StepsTo.LogIn;
import StepsTo.EditAccount;
import StepsTo.selectOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static DataObject.LogInData.*;
import PageObject.OderPage.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static PageObject.OderPage.*;


public class chooseOption extends OpenChrome {

    @Test
    public void selectAllOptions() throws InterruptedException {
    selectOption step1 = new selectOption(driver);
    step1.clickDownloadButton();
    step1.clickShopButton();
    step1.clickFilterContainer();
    step1.clickHighToLow();
//    step1.testPriceFilterHighToLow();
        Thread.sleep(2000);

    ////ul[@class='products']/li[@class='post-160']/a/h3[text()='Selenium Ruby']
    step1.chooseAllSortOptions();

    Thread.sleep(5000);
        String
                expectedResult = "Sort by price: high to low",
                actualResult = driver.findElement(By.xpath("//select[@name='orderby']/option[last()]")).getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);
        System.out.println("actual result is " + actualResult);
        System.out.println("expected result is " + expectedResult);
    }


}
