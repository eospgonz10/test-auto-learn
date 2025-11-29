package co.edu.udea.certificacion.petStore.questions;

import co.edu.udea.certificacion.petStore.userinterfaces.MetricsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MetricsAreVisible implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return MetricsPage.METRICS_CONTAINER.resolveFor(actor).isVisible();
    }

    public static MetricsAreVisible displayed() {
        return new MetricsAreVisible();
    }
}
