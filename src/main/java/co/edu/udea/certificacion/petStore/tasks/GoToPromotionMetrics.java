package co.edu.udea.certificacion.petStore.tasks;

import co.edu.udea.certificacion.petStore.userinterfaces.PromotionsPage;
import co.edu.udea.certificacion.petStore.userinterfaces.MetricsPage;
import co.edu.udea.certificacion.petStore.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToPromotionMetrics implements Task {

    public static GoToPromotionMetrics now() {
        return instrumented(GoToPromotionMetrics.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PromotionsPage.METRICS_BUTTON, isVisible())
                        .forNoMoreThan(5).seconds(),
                Click.on(PromotionsPage.METRICS_BUTTON),
                WaitTime.forMillis(2000),
                WaitUntil.the(MetricsPage.METRICS_CONTAINER, isVisible())
                        .forNoMoreThan(10).seconds()
        );
    }
}
