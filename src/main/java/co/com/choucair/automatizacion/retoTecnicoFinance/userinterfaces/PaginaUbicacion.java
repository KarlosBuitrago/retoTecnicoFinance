package co.com.choucair.automatizacion.retoTecnicoFinance.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaUbicacion extends PageObject {
    public static final Target CAMPO_CIUDAD = Target.the("campo para ingresar la ciudad de residencia")
            .located(By.id("city"));
    public static final Target CAMPO_CODIGO_POSTAL = Target.the("campo para ingresar el codigo postal")
            .located(By.id("zip"));
    public static final Target CONTENEDOR_PAIS = Target.the("campo para ingresar el pais de residencia")
            .located(By.name("countryId"));
    public static final Target SELECTOR_PAIS = Target.the("campo para ingresar el pais de residencia")
            .locatedBy("//*[@name='countryId']/input");
    public static final Target BOTON_DISPOSITIVOS = Target.the("campo para ingresar el pais de residencia")
            .locatedBy("//a[@class='btn btn-blue pull-right']//*[contains(text(),'Next: Devices')]");
}
