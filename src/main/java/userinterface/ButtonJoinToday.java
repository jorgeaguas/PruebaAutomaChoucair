package userinterface;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ButtonJoinToday extends PageObject {
    public static final Target BUTTON_JOIN = Target.the("boton para ir al formulario").located(By.className("class=unauthenticated-nav-bar__sign-up"));
}
