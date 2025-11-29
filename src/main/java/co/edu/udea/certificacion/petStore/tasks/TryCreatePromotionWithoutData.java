package co.edu.udea.certificacion.petStore.tasks;

import co.edu.udea.certificacion.petStore.userinterfaces.CreatePromotionPage;
import co.edu.udea.certificacion.petStore.userinterfaces.PromotionsPage;
import co.edu.udea.certificacion.petStore.utils.WaitTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TryCreatePromotionWithoutData implements Task {

    public static TryCreatePromotionWithoutData now() {
        return instrumented(TryCreatePromotionWithoutData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PromotionsPage.CREATE_BUTTON),
                WaitTime.forMillis(1000),
                WaitUntil.the(CreatePromotionPage.NAME, isVisible())
                        .forNoMoreThan(5).seconds(),
                WaitTime.forMillis(1000),
                Click.on(CreatePromotionPage.NEXT_BUTTON),
                WaitTime.forMillis(1000)
        );
    }
}
