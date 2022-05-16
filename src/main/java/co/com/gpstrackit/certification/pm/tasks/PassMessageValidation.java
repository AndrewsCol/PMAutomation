package co.com.gpstrackit.certification.pm.tasks;

import co.com.gpstrackit.certification.pm.userinterfaces.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PassMessageValidation implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MainPage.TXT_PASS, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue("rmejia2").into(MainPage.TXT_USERNAME),
                Click.on(MainPage.BTN_LOGIN)
        );
    }
    public static PassMessageValidation username(){
        return instrumented(PassMessageValidation.class);
    }
}
