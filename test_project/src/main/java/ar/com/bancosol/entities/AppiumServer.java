package ar.com.bancosol.entities;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumServer {

    AppiumServiceBuilder builder;
    AppiumDriverLocalService service;

    public AppiumServer() {
        builder = new AppiumServiceBuilder();
        builder.withIPAddress(System.getProperty("appium_serverip"));
        builder.usingPort(Integer.parseInt(System.getProperty("appium_serverport")));
    }


    public void start() {
        if (isRunning() == false) {
            service = AppiumDriverLocalService.buildService(builder);
            service.start();
        }
    }


    public boolean isRunning() {
        boolean result;
        try {
            result = service.isRunning();
        } catch (NullPointerException e) {
            result = false;
        }
        return result;
    }

    public void stop() {
        if (isRunning() == true) {
            service.stop();
        }
    }





}
