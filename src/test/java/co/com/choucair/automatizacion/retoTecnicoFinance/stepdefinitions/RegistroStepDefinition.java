package co.com.choucair.automatizacion.retoTecnicoFinance.stepdefinitions;

import co.com.choucair.automatizacion.retoTecnicoFinance.model.DatosRegistro;
import co.com.choucair.automatizacion.retoTecnicoFinance.questions.ConfirmaRegistro;
import co.com.choucair.automatizacion.retoTecnicoFinance.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RegistroStepDefinition {

    @Before
    public void iniciarNavegador(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) desea registrarse en Utest$")
    public void queCarlosDeseaRegistrarseEnUtest(String nombre) throws Exception{
        OnStage.theActorCalled(nombre).wasAbleTo(AbrirPagina.navegar());
    }

    @Cuando("^el ingresa todos los datos de registro$")
    public void elIngresaTodosLosDatosDeRegistro(List<DatosRegistro> datosRegistro) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(DatosPersonales.llenar(datosRegistro),
                Ubicacion.llenar(datosRegistro),Dispositivos.llenar(datosRegistro), UltimoPaso.llenar(datosRegistro));
    }

    @Entonces("^comprueba que se registro correctamente$")
    public void compruebaQueSeRegistroCorrectamente(List<DatosRegistro> datosRegistro) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ConfirmaRegistro.confirmar(datosRegistro)));
    }
}
