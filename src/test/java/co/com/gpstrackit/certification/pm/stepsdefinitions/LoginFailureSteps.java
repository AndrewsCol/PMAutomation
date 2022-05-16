package co.com.gpstrackit.certification.pm.stepsdefinitions;

import co.com.gpstrackit.certification.pm.questions.InvalidPass;
import co.com.gpstrackit.certification.pm.questions.InvalidUsername;
import co.com.gpstrackit.certification.pm.questions.PassRequired;
import co.com.gpstrackit.certification.pm.questions.UsernameRequired;
import co.com.gpstrackit.certification.pm.tasks.InvalidPassValidation;
import co.com.gpstrackit.certification.pm.tasks.InvalidUserValidation;
import co.com.gpstrackit.certification.pm.tasks.PassMessageValidation;
import co.com.gpstrackit.certification.pm.tasks.UsernameMessageValidation;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginFailureSteps {

    @When("^Only the password is entered$")
    public void onlyThePasswordIsEntered() {
        theActorInTheSpotlight().attemptsTo(UsernameMessageValidation.password());
    }

    @Then("^The username validation message is expected to say that the field is required\\.$")
    public void theUsernameValidationMessageIsExpectedToSayThatTheFieldIsRequired() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(UsernameRequired.ValUsernameMessage()));
    }

    @When("^Only the username is entered$")
    public void onlyTheUsernameIsEntered() {
        theActorInTheSpotlight().attemptsTo(PassMessageValidation.username());
    }

    @Then("^The password validation message is expected to say that the field is required\\.$")
    public void thePasswordValidationMessageIsExpectedToSayThatTheFieldIsRequired() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(PassRequired.valPassMessage()));
    }

    @When("^Enter a user that does not exist$")
    public void enterAUserThatDoesNotExist() {
        theActorInTheSpotlight().attemptsTo(InvalidUserValidation.invalidUser());
    }

    @Then("^The system is expected to display the validation message that the user does not exist\\.$")
    public void theSystemIsExpectedToDisplayTheValidationMessageThatTheUserDoesNotExist() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(InvalidUsername.valInvalidUsername()));
    }

    @When("^Enter an existing user and incorrect password$")
    public void enterAnExistingUserAndIncorrectPassword() {
        theActorInTheSpotlight().attemptsTo(InvalidPassValidation.invalidPass());
    }

    @Then("^The system is expected to display the validation message that the password is incorrect\\.$")
    public void theSystemIsExpectedToDisplayTheValidationMessageThatThePasswordIsIncorrect() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(InvalidPass.valInvalidPass()));
    }
}
