package co.com.choucair.automatizacion.retoTecnicoFinance.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registro_utest.feature",
        tags = "@Registro",
        glue = "co.com.choucair.automatizacion.retoTecnicoFinance.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RegistroRunner {
}
