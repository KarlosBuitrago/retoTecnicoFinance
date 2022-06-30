package co.com.choucair.automatizacion.retoTecnicoFinance.questions;

import co.com.choucair.automatizacion.retoTecnicoFinance.model.DatosRegistro;
import co.com.choucair.automatizacion.retoTecnicoFinance.userinterfaces.PaginaUltimoPaso;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class ConfirmaRegistro implements Question<Boolean> {

    private List<DatosRegistro> datosRegistro;

    public ConfirmaRegistro(List<DatosRegistro> datosRegistro) {
        this.datosRegistro = datosRegistro;
    }

    public static ConfirmaRegistro confirmar(List<DatosRegistro> datosRegistro) {
        return new ConfirmaRegistro(datosRegistro);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String textoBoton = Text.of(PaginaUltimoPaso.BOTON_REGISTRAR).viewedBy(actor).asString();

        return datosRegistro.get(0).getMensaje().equals(textoBoton);
    }
}
