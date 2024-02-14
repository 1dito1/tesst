package StepsTo;

import PageObject.OderPage;
import org.openqa.selenium.WebDriver;

import static DataObject.LogInData.correctUsername;
public class selectOption extends OderPage {
    WebDriver driver;
    public selectOption (WebDriver driver1){
        driver = driver1;
    }
    public void clickDownloadButton(){
        driver.findElement(downloadsButton).click();
    }
    public void clickShopButton(){
        driver.findElement(goToShopButton).click();
    }
    public void clickFilterContainer(){
        driver.findElement(dropdownButton).click();

    }
    public void clickHighToLow(){
        driver.findElement(lastOption).click();
    }
    public void addToCart(){
        driver.findElement(addToCartButton).click();
    }

}
