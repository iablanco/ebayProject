package ar.com.bancosol.entities;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriver {

    private static io.appium.java_client.android.AndroidDriver driver;
    private static AppiumServer appiumServer;

    public static io.appium.java_client.android.AndroidDriver createDriver(){
        if(driver == null) {
            appiumServer = new AppiumServer();
            appiumServer.start();
            try {

                String urlAppiumServre = String.format("http://%s:%s/wd/hub", System.getProperty("appium_serverip"), Integer.parseInt(System.getProperty("appium_serverport")));
                URL url = new URL(urlAppiumServre);
                driver = new io.appium.java_client.android.AndroidDriver(url, getDriverDesiredCapabilities());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;
    }

    private static DesiredCapabilities getDriverDesiredCapabilities(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, System.getProperty("device_name"));
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.AVD,System.getProperty("avd_name"));
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.AVD_ARGS,"");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.AVD_LAUNCH_TIMEOUT,700000);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
        return desiredCapabilities;

    }

    public static void openPage(String url)
    {
        driver.get(url);
    }

    public static void quit(){ driver.quit();}
}
