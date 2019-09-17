package ar.com.bancosol.step;

import ar.com.bancosol.page.HomePage;
import org.junit.Assert;
import net.thucydides.core.annotations.Step;

public class HomeSteps {

    private HomePage homePage = new HomePage();

    @Step("Ingresar pilas en el buscador")
    public HomeSteps enterPilas() {
        Assert.assertTrue("No se encontr\u00ed caja de texto de b\u00fasqueda",homePage.searchTxtBoxExists());
        homePage.getSearchBar().click();
        homePage.getSearchBar().sendKeys("Pilas");
        return this;
    }

    @Step("Tap en lupa para buscar")
    public HomeSteps tapSearchGlass() {
        Assert.assertNotNull("Bot\u00edn de b\u00fasqueda no encontrado",homePage.getSearchButton());
        homePage.getSearchButton().click();
        return this;
    }

}
