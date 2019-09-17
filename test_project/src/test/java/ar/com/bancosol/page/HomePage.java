package ar.com.bancosol.page;

import ar.com.bancosol.entities.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {

   private WebDriver driver = AndroidDriver.createDriver();
   private WebDriverWait wait = new WebDriverWait(driver, 40);

    private String nameSearchBarLocator = "_nkw";
    private String searchButtonLocator = "//input[contains(@value,'Buscar')]";


    public boolean searchTxtBoxExists() {
        try{
            wait.until(ExpectedConditions.elementToBeClickable(By.name(nameSearchBarLocator)));

            getSearchBar().isDisplayed();
        }
        catch(Exception e){
            return false;
        }
        return true;
    }

    public WebElement getSearchBar() {
        return driver.findElement(By.name(nameSearchBarLocator));
    }

    public WebElement getSearchButton() {
        return driver.findElement(By.xpath(searchButtonLocator));
    }

}
