package co.edu.udea.certificacion.petStore.questions;

import co.edu.udea.certificacion.petStore.userinterfaces.CreatePromotionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ErrorMessageIsVisible implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return CreatePromotionPage.ERROR_MESSAGE.resolveFor(actor).isVisible();
    }

    public static ErrorMessageIsVisible displayed() {
        return new ErrorMessageIsVisible();
    }
}
