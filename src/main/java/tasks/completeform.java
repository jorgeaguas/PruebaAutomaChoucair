package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.UTestPage;

public class completeform implements Task {
    public static completeform fields() {
        return Tasks.instrumented(completeform.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
