package co.com.choucair.automatizacion.retoTecnicoFinance.tasks;


import co.com.choucair.automatizacion.retoTecnicoFinance.model.DatosRegistro;
import co.com.choucair.automatizacion.retoTecnicoFinance.userinterfaces.PaginaUbicacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.automatizacion.retoTecnicoFinance.userinterfaces.PaginaUbicacion.*;

public class Ubicacion implements Task {

    private List<DatosRegistro> datosRegistros;

    public Ubicacion(List<DatosRegistro> datosRegistros) {
        this.datosRegistros = datosRegistros;
    }

    public static Ubicacion llenar(List<DatosRegistro> datosRegistro) {
        return Tasks.instrumented(Ubicacion.class, datosRegistro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datosRegistros.get(0).getCiudad()).into(CAMPO_CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(CAMPO_CIUDAD),
                Hit.the(Keys.ENTER).into(CAMPO_CIUDAD),
                Enter.theValue(datosRegistros.get(0).getCodigoPostal()).into(CAMPO_CODIGO_POSTAL),
                Click.on(CONTENEDOR_PAIS),
                Enter.theValue(datosRegistros.get(0).getPais()).into(SELECTOR_PAIS),
                Click.on(BOTON_DISPOSITIVOS)
        );
    }
}
