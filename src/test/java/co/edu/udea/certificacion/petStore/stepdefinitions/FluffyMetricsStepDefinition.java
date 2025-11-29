package co.edu.udea.certificacion.petStore.stepdefinitions;

import co.edu.udea.certificacion.petStore.questions.MetricsAreVisible;
import co.edu.udea.certificacion.petStore.tasks.GoToPromotionMetrics;
import io.cucumber.java.en.*;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class FluffyMetricsStepDefinition {

    @When("accede a la vista de métricas de la promoción activa")
    public void goToMetrics() {
        theActorInTheSpotlight().attemptsTo(
                GoToPromotionMetrics.now()
        );
    }

    @Then("debería ver las métricas de dicha promoción en ventas")
    public void verifyMetricsVisible() {
        theActorInTheSpotlight().should(
                seeThat(MetricsAreVisible.displayed())
        );
    }
}
