package StepsTo;

import PageObject.ResetPassObject;
import org.openqa.selenium.WebDriver;

public class ResetPassword extends ResetPassObject {

    WebDriver driver;
    public ResetPassword(WebDriver driver1){
        driver = driver1;
    }
    public void clickResetPass(){
        driver.findElement(resetPassButton).click();
    }
    public void fillEmail(String email){
        driver.findElement(inputEmail).sendKeys(email);
    }
    public void clickResetButton(){
        driver.findElement(submitButton).click();
    }
}
