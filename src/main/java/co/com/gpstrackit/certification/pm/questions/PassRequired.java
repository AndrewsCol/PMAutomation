package co.com.gpstrackit.certification.pm.questions;

import co.com.gpstrackit.certification.pm.userinterfaces.MainPage;
import co.com.gpstrackit.certification.pm.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PassRequired implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Constant.ALERT_MESSAGE.equals(Text.of(MainPage.LBL_REQUIRED_MESSAGE_PASS).viewedBy(actor).asString());
    }
    public static PassRequired valPassMessage() {
        return new PassRequired();
    }
}
