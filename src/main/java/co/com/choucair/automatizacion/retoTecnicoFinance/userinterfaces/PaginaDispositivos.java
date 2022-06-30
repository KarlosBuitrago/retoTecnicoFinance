package co.com.choucair.automatizacion.retoTecnicoFinance.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDispositivos extends PageObject {
    public static final Target CONTENEDOR_SISTEMA = Target.the("Campo para ingresar el Sistema Operativo del PC")
            .located(By.name("osId"));
    public static final Target SELECTOR_SISTEMA = Target.the("Campo para Seleccionar el Sistema Operativo del PC")
            .locatedBy("//*[@name='osId']/input");
    public static final Target CONTENEDOR_VERSION = Target.the("Campo para ingresar la version del Sistema Operativo del PC")
            .located(By.name("osVersionId"));
    public static final Target SELECTOR_VERSION = Target.the("Campo para Seleccionar la version del Sistema Operativo del PC")
            .locatedBy("//*[@name='osVersionId']/input");
    public static final Target CONTENEDOR_IDIOMA_SISTEMA = Target.the("Campo para ingresar el idioma del PC")
            .located(By.name("osLanguageId"));
    public static final Target SELECTOR_IDIOMA_SISTEMA = Target.the("Campo para seleccionar el idioma del PC")
            .locatedBy("//*[@name='osLanguageId']/input");
    public static final Target CONTENEDOR_MOVIL = Target.the("Campo para ingresar el dispositivo movil")
            .located(By.name("handsetMakerId"));
    public static final Target SELECTOR_MOVIL = Target.the("campo para seleccionar el dispositivo movil")
            .locatedBy("//*[@name='handsetMakerId']/input");
    public static final Target CONTENEDOR_MODELO_MOVIL = Target.the("Campo para ingresar el modelo del dispositivo movil")
            .located(By.name("handsetModelId"));
    public static final Target SELECTOR_MODELO_MOVIL = Target.the("Campo para seleccionar el modelo del dispositivo movil")
            .locatedBy("//*[@name='handsetModelId']/input");
    public static final Target CONTENEDOR_SISTEMA_OPERATIVO = Target.the("Campo para ingresar el sistema operativo del dispositivo movil")
            .located(By.name("handsetOSId"));
    public static final Target SELECTOR_SISTEMA_OPERATIVO = Target.the("Campo para seleccionar el sistema operativo del dispositivo movil")
            .locatedBy("//*[@name='handsetOSId']/input");
    public static final Target BOTON_ULTIMO_PASO = Target.the("Campo para ingresar el sistema operativo del dispositivo movil")
            .locatedBy("//*[contains(text(), 'Next: Last Step')]");
}
