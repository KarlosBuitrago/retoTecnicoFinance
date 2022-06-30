package co.com.choucair.automatizacion.retoTecnicoFinance.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class PaginaInicio extends PageObject {
    public static final Target BOTON_REGISTRO = Target.the("Boton para dirigirse a registro")
            .located(By.xpath("//a[@href='/signup/personal']"));
}
