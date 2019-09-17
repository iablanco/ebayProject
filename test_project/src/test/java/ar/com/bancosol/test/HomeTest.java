package ar.com.bancosol.test;

import ar.com.bancosol.entities.AndroidDriver;
import ar.com.bancosol.step.HomeSteps;
import ar.com.bancosol.step.ResultsSteps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HomeTest {

    private HomeSteps homeSteps;
    private ResultsSteps resultsSteps;

    @Before
    public void start() {
        homeSteps = new HomeSteps();
        resultsSteps = new ResultsSteps();
        AndroidDriver.createDriver();
        AndroidDriver.openPage("http://www.ebay.com");
    }

    @Test
    public void searchPilasInEbay(){
        homeSteps.enterPilas()
                .tapSearchGlass();
        resultsSteps.getResultsSize();
    }

    @After
    public void quit(){
        AndroidDriver.quit();
    }
}
