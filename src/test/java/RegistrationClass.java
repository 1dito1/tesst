import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class RegistrationClass {
    public static WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void openBrowser(){
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/my-account/");

    }
    @Test
    public void Registration() throws InterruptedException {


        WebElement username = driver.findElement(By.id("reg_email"));
        username.sendKeys("dito28111@gmail.com");
        WebElement password = driver.findElement(By.id("reg_password"));
        password.sendKeys("1MeMiyvars@Java1");
        driver.findElement(By.name("register")).click();
        Thread.sleep(1000);

//        String
//                expectedResult = "Hello dito282 (not dito282? Sign out)",
//                actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/p[1]")).getText();
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals(actualResult, expectedResult);
//        softAssert.assertAll();

    }
//    @AfterTest
//    public void closeChrome(){
//
//        driver.close();
//    }
}
