package Test.steps.serenity;

import Test.pages.GoogleTranslatePage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleTranslateSteps {

    GoogleTranslatePage googleTranslatePage;

    @Step
    public void is_the_home_page() {
        googleTranslatePage.open();
    }

    @Step
    public void selectLanguages(String firstLang, String secondLang) {
        googleTranslatePage.getMoreButtonEng().click();
        googleTranslatePage.getEnterEngLang().sendKeys(firstLang);
        googleTranslatePage.getEnterEngLang().sendKeys(Keys.ENTER);
        googleTranslatePage.getMoreButtonUa().click();
        googleTranslatePage.getResultUaLang().sendKeys(secondLang);
        googleTranslatePage.getResultUaLang().sendKeys(Keys.ENTER);
    }

    @Step
    public void enterWord(String enteredWord) {
        googleTranslatePage.getEnterField().sendKeys(enteredWord);
        //googleTranslatePage.getEnterField().sendKeys(Keys.ENTER);
    }

    @Step
    public void checkWord(String checkWord) {
        Assert.assertEquals(checkWord, googleTranslatePage.getResultField().getText());
    }

//    @Step
//    public void checkCountOfWords(String expectedCount){
//        String actualCount = googleTranslatePage.getCountField().getText();
//        actualCount = actualCount.substring(0, actualCount.indexOf('/'));
//        Assert.assertEquals(expectedCount, actualCount);
//    }
    @Step
    public void checkCountOfWords(){
        String actualText = googleTranslatePage.getCountField().getText();
        int actualCount = Integer.parseInt(actualText.substring(0, actualText.indexOf('/')));
        String word = (String)Serenity.getCurrentSession().get("enteredWord");
        int lenthOfWord =word.length();
        Assert.assertEquals(lenthOfWord, actualCount);
    }

    @Step
    public void checkDefinition(String definition) {
        String actualResult = "";
        int size = googleTranslatePage.getDefinitionField().size();
        for (int i = 0; i < size; i++) {
            if (googleTranslatePage.getDefinitionField().get(i).getText().equals(definition)) {
                actualResult = actualResult + googleTranslatePage.getDefinitionField().get(i).getText();
            }
        }
        Assert.assertEquals(definition, actualResult);
    }
}
