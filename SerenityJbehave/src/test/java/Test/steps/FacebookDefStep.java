package Test.steps;

import Test.steps.serenity.FacebookCheckErrorStep;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class FacebookDefStep {

    @Steps
    FacebookCheckErrorStep page;

    @Given("the user is on the Facebook login page")
    public void theUserIsOnTheFacebookLoginPage() {
        page.is_the_home_page();
    }

    @When("the user enter yours login and password '$email' '$password'")
    public void theUserEnterYoursLoginAndPassword(String email, String password) {
        page.makeLogin(email, password);
    }

    @Then("they should see diference between expected and current error '$error'")
    public void theyShouldSeeDifferenceBetweenExpectedAndCurrentError(String error) {
        page.checkError(error);
    }
}
