package co.com.choucair.automatizacion.retoTecnicoFinance.tasks;

import co.com.choucair.automatizacion.retoTecnicoFinance.model.DatosRegistro;
import co.com.choucair.automatizacion.retoTecnicoFinance.userinterfaces.PaginaUltimoPaso;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.automatizacion.retoTecnicoFinance.userinterfaces.PaginaUltimoPaso.*;

public class UltimoPaso implements Task {

    private List<DatosRegistro> datosRegistro;

    public UltimoPaso(List<DatosRegistro> datosRegistro) {
        this.datosRegistro = datosRegistro;
    }

    public static UltimoPaso llenar(List<DatosRegistro> datosRegistro) {
        return Tasks.instrumented(UltimoPaso.class, datosRegistro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosRegistro.get(0).getContrasenia()).into(CAMPO_CONTRASENIA),
                Enter.theValue(datosRegistro.get(0).getConfirmaContrasenia()).into(CAMPO_CONFIRMAR_CONTRASENIA),
                Click.on(MANTENTE_INFORMADO),
                Click.on(TERMINOS_USO),
                Click.on(POLITICA_PRIVACIDAD),
                Click.on(BOTON_REGISTRAR)
        );
    }
}
