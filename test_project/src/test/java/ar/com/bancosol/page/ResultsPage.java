package ar.com.bancosol.page;

import ar.com.bancosol.entities.AndroidDriver;
import ar.com.bancosol.entities.DriverWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ResultsPage {

    //private WebDriver driver = DriverWeb.getInstance();
    private WebDriver driver = AndroidDriver.createDriver();
    private WebDriverWait wait = new WebDriverWait(driver,40);
    private String listResultsLocator = "//*[@id='srp-river-results']/ul/li";

    public List<WebElement> getResults(){
        return driver.findElements(By.xpath(listResultsLocator));
    }

    public boolean resultsExists(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(listResultsLocator)));
        if(getResults() == null)
        {
            return false;
        }
        return true;
    }

}
