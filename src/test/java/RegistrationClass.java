import Browser.OpenChromeWithoutLogin;
import StepsTo.Registration;
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
public class RegistrationClass {
//    public static WebDriver driver = new ChromeDriver();
//    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
public static WebDriver driver = new ChromeDriver();
    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


    @BeforeTest
    public void openBrowser(){
        driver.manage().window().maximize();
        driver.get("https://practice.automationtesting.in/my-account/");

    }
    @Test
    public void Registration(){


        WebElement username = driver.findElement(By.id("reg_email"));
        username.sendKeys("ditos9911ffd3@gmail.com");
        WebElement password = driver.findElement(By.id("reg_password"));
        password.sendKeys("1MeMiyvars@Java1");
        WebElement element = driver.findElement(By.xpath("//input[@name='register']"));

        wait.until(ExpectedConditions.elementToBeClickable(element));

//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click();", element);
        element.click();

        WebElement registeredUsername = driver.findElement(By.xpath("//p//strong"));
        wait.until(ExpectedConditions.visibilityOf(registeredUsername));

        String
                expectedResult = "ditos9911ffd3",
                actualResult = registeredUsername.getText();

        System.out.println(actualResult);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);
        softAssert.assertAll();

    }
    @AfterTest
    public void closeChrome(){

        driver.close();
    }


//
//        WebElement username = driver.findElement(By.id("reg_email"));
//        username.sendKeys("ditos9911ffd3@gmail.com");
//        WebElement password = driver.findElement(By.id("reg_password"));
//        password.sendKeys("1MeMiyvars@Java1");
//        WebElement element = driver.findElement(By.xpath("//input[@name='register']"));
//
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//
////        JavascriptExecutor executor = (JavascriptExecutor)driver;
////        executor.executeScript("arguments[0].click();", element);
//        element.click();
//
//        WebElement registeredUsername = driver.findElement(By.xpath("//p//strong"));
//        wait.until(ExpectedConditions.visibilityOf(registeredUsername));
//
//        String
//                expectedResult = "ditos9911ffd3",
//                actualResult = registeredUsername.getText();
//
//        System.out.println(actualResult);
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals(actualResult, expectedResult);
//        softAssert.assertAll();
//
//    }
//public class RegistrationClass extends OpenChromeWithoutLogin {
//
//    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//
//
//
//    @Test
//    public void Registration() throws InterruptedException {
//
////
////        WebElement username = driver.findElement(By.id("reg_email"));
////        username.sendKeys("ditos99141qffd3@gmail.com");
////        WebElement password = driver.findElement(By.id("reg_password"));
////        password.sendKeys("1MeMiyvars@Java1");
////        WebElement element = driver.findElement(By.xpath("//input[@name='register']"));
//
////        wait.until(ExpectedConditions.elementToBeClickable());
//
////        JavascriptExecutor executor = (JavascriptExecutor)driver;
////        executor.executeScript("arguments[0].click();", element);
////        element.click();
//        //    public void clickregister(){
////
//////        wait.until(ExpectedConditions.elementToBeClickable(regButton));
//
//
//        Registration step1 = new Registration(driver);
//        step1.email(regEmail);
//        step1.password(regPassword);
////        step1.wait(ExpectedConditions.elementToBeClickable(regButton));
////        WebElement element = driver.findElement(By.xpath("//input[@name='register' and @type='submit']"));
//        Duration timeout = Duration.ofSeconds(10);
//
//        WebDriverWait wait = new WebDriverWait(driver, timeout);
//        WebElement registerButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='register' and @type='submit']")));
//        registerButton.click();
//        Thread.sleep(3000);
//
////        wait.until(ExpectedConditions.elementToBeClickable(element));
////        element.click();
//
//        WebElement registeredUsername = driver.findElement(By.xpath("//p//strong"));
//        wait.until(ExpectedConditions.visibilityOf(registeredUsername));
//
//        String
//                expectedResult = "ditos9911ffd3",
//                actualResult = registeredUsername.getText();
//
//        System.out.println(actualResult);
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals(actualResult, expectedResult);
//        softAssert.assertAll();
//
//    }
//
//}

//    @AfterTest
//    public void closeChrome(){
//
//        driver.close();
//    }
}