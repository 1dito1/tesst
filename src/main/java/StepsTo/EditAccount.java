package StepsTo;

import PageObject.LogInObject;
import org.openqa.selenium.WebDriver;

public class EditAccount  extends  LogInObject{


    WebDriver driver;
    public EditAccount(WebDriver driver1){
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
    public void clickAccDetails(){
        driver.findElement(accDetails).click();
    }
    public void clickSaveChanges(){
        driver.findElement(saveChanges).click();
    }
}
