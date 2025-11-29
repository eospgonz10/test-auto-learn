package co.edu.udea.certificacion.petStore.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MetricsPage {

    public static final Target METRICS_CONTAINER = Target.the("contenedor de métricas")
            .located(By.xpath("//*[@id='root']/div[2]/main/div/div[3]/div"));
}
