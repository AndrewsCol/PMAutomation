package co.com.gpstrackit.certification.pm.questions;

import co.com.gpstrackit.certification.pm.userinterfaces.MainPage;
import co.com.gpstrackit.certification.pm.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class InvalidUsername implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Constant.INVALID_USERNAME_MESSAGE.equals(Text.of(MainPage.LBL_INVALID_USERNAME).viewedBy(actor).asString());
    }
    public static InvalidUsername valInvalidUsername() {
        return new InvalidUsername();
    }
}
