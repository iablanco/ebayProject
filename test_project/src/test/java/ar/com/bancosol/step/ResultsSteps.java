package ar.com.bancosol.step;

import ar.com.bancosol.page.ResultsPage;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ResultsSteps {

    ResultsPage resultsPage = new ResultsPage();


    @Step("Validar resultados")
    public void getResultsSize(){
        Assert.assertTrue("Resultados no encontrados",resultsPage.resultsExists());
        System.out.print("************************** Se encontraron " + resultsPage.getResults().size() + " resultados *************************** ");
    }
}
