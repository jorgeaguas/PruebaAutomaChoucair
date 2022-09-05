package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Login;
import tasks.OpenUp;
import tasks.completeform;


public class pruebaTecnicaStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que Jorge ingresa a la pagina web de Utest.com y proceder a dar clic en la opcion de registro JOIN TODAY$")
    public void queJorgeingresaaapaginawebdeUtestyprocederadarclicenlaopcionderegistroJOINTODAY(){
        OnStage.theActorCalled("Jorge").wasAbleTo(OpenUp.thepage(),Login.onThePage());

    }

    @When("^realizar el diligenciamiento del formulario con la finalidad de crear un nuevo usuario$")
    public void realizareldiligenciamientodelformularioconlafinalidaddecrearunnuevousuario(){
        OnStage.theActorCalled("Jorge").wasAbleTo(completeform.fields());
    }

    @Then("^finalizar dando click en el Boton de completar configuracion$")
    public void finalizardandoclickenelBotondecompletarconfiguracion(){

    }

}
