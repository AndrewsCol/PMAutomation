package co.com.gpstrackit.certification.pm.questions;

import co.com.gpstrackit.certification.pm.userinterfaces.MainPage;
import co.com.gpstrackit.certification.pm.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class InvalidPass implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Constant.INVALID_PASS_MESSAGE.equals(Text.of(MainPage.LBL_INVALID_PASS).viewedBy(actor).asString());
    }
    public static InvalidPass valInvalidPass() {
        return new InvalidPass();
    }
}
