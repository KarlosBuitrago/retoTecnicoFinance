package co.com.choucair.automatizacion.retoTecnicoFinance.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDatosPersonales extends PageObject {
    public static final Target CAMPO_NOMBRE = Target.the("Campo para el ingreso del nombre")
            .located(By.id("firstName"));
    public static final Target CAMPO_APELLIDO = Target.the("Campo para el ingreso del apellido")
            .located(By.id("lastName"));
    public static final Target CAMPO_CORREO = Target.the("Campo para el ingresar el correo")
            .located(By.id("email"));
    public static final Target SELECTOR_MES = Target.the("Campo para seleccion mes de cumpleaños")
            .located(By.id("birthMonth"));
    public static final Target SELECTOR_DIA = Target.the("Campo para seleccionar el dia de Cumpleaños")
            .located(By.id("birthDay"));
    public static final Target SELECTOR_ANIO = Target.the("Campo para seleccionar el año de cumpleaños")
            .located(By.id("birthYear"));
    public static final Target CONTENEDOR_IDIOMAS = Target.the("Contenedor de idiomas")
            .located(By.xpath("//input[@aria-label='Select box']"));
    public static final Target SELECTOR_IDIOMAS = Target.the("Seleccion de idiomas")
            .locatedBy("//*[@class='ui-select-choices-row-inner']//*[contains(text(), '{0}')]");
    public static final Target BOTON_UBICACION = Target.the("Boton para ir a la pantalla de ubicacion")
            .locatedBy("//a[@class='btn btn-blue']/*[contains(text(), 'chevron_right')]");
}
