package co.com.choucair.automatizacion.retoTecnicoFinance.tasks;

import co.com.choucair.automatizacion.retoTecnicoFinance.userinterfaces.PaginaInicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.choucair.automatizacion.retoTecnicoFinance.userinterfaces.PaginaInicio.*;

public class AbrirPagina implements Task {

    PaginaInicio paginaInicio;
    public static AbrirPagina navegar() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaInicio),
                Click.on(BOTON_REGISTRO));
    }
}
