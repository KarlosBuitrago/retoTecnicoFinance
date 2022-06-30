package co.com.choucair.automatizacion.retoTecnicoFinance.tasks;

import co.com.choucair.automatizacion.retoTecnicoFinance.model.DatosRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.automatizacion.retoTecnicoFinance.userinterfaces.PaginaDispositivos.*;

public class Dispositivos implements Task {

    private List<DatosRegistro> datosRegistro;

    public Dispositivos(List<DatosRegistro> datosRegistros) {
        this.datosRegistro = datosRegistros;
    }

    public static Dispositivos llenar(List<DatosRegistro> datosRegistros) {
        return Tasks.instrumented(Dispositivos.class, datosRegistros);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONTENEDOR_SISTEMA),
                Enter.theValue(datosRegistro.get(0).getSistema()).into(SELECTOR_SISTEMA),
                Hit.the(Keys.ENTER).into(SELECTOR_SISTEMA),
                Click.on(CONTENEDOR_VERSION),
                Enter.theValue(datosRegistro.get(0).getVersion()).into(SELECTOR_VERSION),
                Hit.the(Keys.ENTER).into(SELECTOR_VERSION),
                Click.on(CONTENEDOR_IDIOMA_SISTEMA),
                Enter.theValue(datosRegistro.get(0).getIdiomaSistema()).into(SELECTOR_IDIOMA_SISTEMA),
                Hit.the(Keys.ENTER).into(SELECTOR_IDIOMA_SISTEMA),
                Click.on(CONTENEDOR_MOVIL),
                Enter.theValue(datosRegistro.get(0).getMovil()).into(SELECTOR_MOVIL),
                Hit.the(Keys.ENTER).into(SELECTOR_MOVIL),
                Click.on(CONTENEDOR_MODELO_MOVIL),
                Enter.theValue(datosRegistro.get(0).getModeloMovil()).into(SELECTOR_MODELO_MOVIL),
                Hit.the(Keys.ENTER).into(SELECTOR_MODELO_MOVIL),
                Click.on(CONTENEDOR_SISTEMA_OPERATIVO),
                Enter.theValue(datosRegistro.get(0).getSitemaOperativoMovil()).into(SELECTOR_SISTEMA_OPERATIVO),
                Hit.the(Keys.ENTER).into(SELECTOR_SISTEMA_OPERATIVO),
                Click.on(BOTON_ULTIMO_PASO)
        );
    }
}
