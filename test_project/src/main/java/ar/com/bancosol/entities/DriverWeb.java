package ar.com.bancosol.entities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverWeb {

    private WebDriverWait webDriverWait;
    private static WebDriver driver;

    public DriverWeb(){
        if(driver==null){
            driver = getInstance();
        }

    }

    public static WebDriver getInstance() {

        if(driver==null)
        {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("incognito");
            chromeOptions.addArguments("--start-maximized");
            chromeCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
            driver = new ChromeDriver(chromeOptions);
        }

        return driver;
    }

}
