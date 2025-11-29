package co.edu.udea.certificacion.petStore.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SelectProductPage {
    public static final Target PRODUCT_CHECKBOX =
            Target.the("checkbox producto")
                    .locatedBy("//h4[contains(text(),'Pomada cicatrizante mascotas')]/ancestor::div[contains(@class,'cursor-pointer')]//button[@role='checkbox']");

    public static final Target SAVE_BUTTON =
            Target.the("botón guardar")
                    .locatedBy("//button[contains(.,'Guardar')]");
}
