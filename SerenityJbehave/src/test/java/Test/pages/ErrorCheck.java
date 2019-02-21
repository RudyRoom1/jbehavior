package Test.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class ErrorCheck extends PageObject {

    @FindBy(xpath = "//div[@class=\"_4rbf _53ij\"]")
    private WebElementFacade errorMessage;

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}
