package co.com.gpstrackit.certification.pm.tasks;

import co.com.gpstrackit.certification.pm.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
public class LogOut implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainPage.LBL_ACCOUNT),
                WaitUntil.the(MainPage.LBL_SIGN_OUT, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(MainPage.LBL_SIGN_OUT)
        );
    }
    public static LogOut logout() {

        return instrumented(LogOut.class);
    }
}
