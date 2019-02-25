package Test.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://www.facebook.com")
public class FacebookPage extends PageObject {

    @FindBy(xpath = "//input[@type='email']")
    private WebElementFacade login;

    @FindBy(xpath = "//input[@type='password']")
    private List<WebElementFacade> password;

    @FindBy(xpath = "//input[@data-testid='royal_login_button']")
    private WebElementFacade loginButton;

    public WebElementFacade getEmailTextField() {
        return login;
    }

    public WebElementFacade getPasswordTextField() {
        return password.get(0);
    }

    public WebElementFacade getLoginButton() {
        return loginButton;
    }


}
