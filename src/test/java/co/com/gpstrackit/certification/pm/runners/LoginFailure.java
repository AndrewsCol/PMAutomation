package co.com.gpstrackit.certification.pm.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Features/login_failure.feature",
        glue = "co.com.gpstrackit.certification.pm.stepsdefinitions",
        //tags = "@contrasena_incorrecta",
        snippets = SnippetType.CAMELCASE)

public class LoginFailure {
}
