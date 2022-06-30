package co.com.choucair.automatizacion.retoTecnicoFinance.tasks;

import co.com.choucair.automatizacion.retoTecnicoFinance.model.DatosRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.automatizacion.retoTecnicoFinance.userinterfaces.PaginaDatosPersonales.*;

public class DatosPersonales implements Task {
    private List<DatosRegistro> datosRegistro;

    public DatosPersonales(List<DatosRegistro> datosRegistro) {
        this.datosRegistro = datosRegistro;
    }

    public static DatosPersonales llenar(List<DatosRegistro> datosRegistro) {
        return Tasks.instrumented(DatosPersonales.class, datosRegistro);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datosRegistro.get(0).getNombre()).into(CAMPO_NOMBRE),
                Enter.theValue(datosRegistro.get(0).getApellido()).into(CAMPO_APELLIDO),
                Enter.theValue(datosRegistro.get(0).getCorreo()).into(CAMPO_CORREO),
                SelectFromOptions.byVisibleText(datosRegistro.get(0).getMes()).from(SELECTOR_MES),
                SelectFromOptions.byVisibleText(String.valueOf(datosRegistro.get(0).getDia())).from(SELECTOR_DIA),
                SelectFromOptions.byVisibleText(String.valueOf(datosRegistro.get(0).getAnio())).from(SELECTOR_ANIO),
                Enter.theValue(datosRegistro.get(0).getIdioma()).into(CONTENEDOR_IDIOMAS),
                Click.on(SELECTOR_IDIOMAS.of(datosRegistro.get(0).getIdioma())),
                Click.on(BOTON_UBICACION));
    }
}
