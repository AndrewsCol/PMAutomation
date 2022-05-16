package co.com.gpstrackit.certification.pm.stepsdefinitions;

import co.com.gpstrackit.certification.pm.questions.UsernameValidation;
import co.com.gpstrackit.certification.pm.tasks.LogOut;
import co.com.gpstrackit.certification.pm.tasks.LoginMainPage;
import co.com.gpstrackit.certification.pm.utils.MyDriverWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.GivenWhenThen;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginPMSteps {
    @Given("^I am in the chrome web browser at the url$")
    public void iAmInTheChromeWebBrowserAtTheUrl() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Andres");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriverWeb.web().inThePage("https://spm.gpstrackit.com/login")));
    }

    @When("^Credentials are entered$")
    public void credentialsAreEntered() {
        theActorInTheSpotlight().attemptsTo(LoginMainPage.login());
    }
    @Then("^Successful login is expected$")
    public void successfulLoginIsExpected() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(UsernameValidation.ValLogin()));
        theActorInTheSpotlight().attemptsTo(LogOut.logout());
    }
}
