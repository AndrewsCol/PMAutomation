package co.com.gpstrackit.certification.pm.questions;

import co.com.gpstrackit.certification.pm.userinterfaces.MainPage;
import co.com.gpstrackit.certification.pm.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class UsernameValidation implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WaitUntil.the(MainPage.LBL_ACCOUNT, isPresent()).forNoMoreThan(15).seconds();
        return Constant.LOGIN_USERNAME.equals(Text.of(MainPage.LBL_ACCOUNT).viewedBy(actor).asString());
    }
    public static UsernameValidation ValLogin() {
        return new UsernameValidation();
    }
}
