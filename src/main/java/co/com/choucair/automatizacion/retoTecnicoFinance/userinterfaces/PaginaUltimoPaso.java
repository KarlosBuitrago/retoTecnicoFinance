package co.com.choucair.automatizacion.retoTecnicoFinance.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaUltimoPaso extends PageObject {
    public static final Target CAMPO_CONTRASENIA = Target.the("Campo para ingresar la contraseña")
            .located(By.id("password"));
    public static final Target CAMPO_CONFIRMAR_CONTRASENIA = Target.the("Campo para confirmar la contraseña")
            .located(By.id("confirmPassword"));
    public static final Target MANTENTE_INFORMADO = Target.the("Check de seleccion mantente informado")
            .located(By.name("newsletterOptIn"));
    public static final Target TERMINOS_USO = Target.the("Check para terminos de uso")
            .located(By.id("termOfUse"));
    public static final Target POLITICA_PRIVACIDAD = Target.the("Check para politica de privacidad")
            .located(By.id("privacySetting"));
    public static final Target BOTON_REGISTRAR = Target.the("Campo para ingresar la contraseña")
            .located(By.id("laddaBtn"));
}
