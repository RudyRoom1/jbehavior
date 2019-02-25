package Test.steps;

import Test.steps.serenity.GoogleTranslateSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class GoogleTranslateDefSteps {

    @Steps
    GoogleTranslateSteps googleTranslateSteps;

    @Given("the user is on the google translate page '$firstLang' '$secondLang'")
    public void givenTheUserIsOnTheGoogleTranslatePage(String firstLang, String secondLang) {
        googleTranslateSteps.is_the_home_page();
        googleTranslateSteps.selectLanguages(firstLang, secondLang);
    }

    @When("the user looks up the translation of the word '$enteredWord'")
    public void whenTheUserLooksUpTheTranslationOfTheWordApple(String enteredWord) {
        googleTranslateSteps.enterWord(enteredWord);
    }

    @Then("number of characters must be '$numberOfChar'")
    public void thenNumberOfCharactersMustBe(String numberOfChar) {
        googleTranslateSteps.checkCountOfWords(numberOfChar);
    }

    @Then("the user looks up the definition of the word  '$definition'")
    public void thenTheUserLooksUpTheDefinitionOfTheWordTheTreeWhichBearsApples(String definition) {
        googleTranslateSteps.checkDefinition(definition);
    }

    @Then("they should see the translate of word '$checkWord'")
    public void thenTheyShouldSeeTheTranslateOfWord(String checkWord) {
        googleTranslateSteps.checkWord(checkWord);
    }


}
