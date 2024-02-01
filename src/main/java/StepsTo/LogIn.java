package StepsTo;
import DataObject.LogInData.*;
import PageObject.LogInObject;
import org.openqa.selenium.WebDriver;

import static DataObject.LogInData.correctUsername;

public class LogIn extends LogInObject {
    WebDriver driver;
    public LogIn(WebDriver driver1){
        driver = driver1;
    }


    public void fillUsername(String username){

        driver.findElement(usernameField).sendKeys(username);
    }
    public void fillPassword(String password){

        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickSubmit(){

        driver.findElement(submitButton).click();
    }
    public void clickLogout(){
        driver.findElement(logoutButton).click();
    }


}
