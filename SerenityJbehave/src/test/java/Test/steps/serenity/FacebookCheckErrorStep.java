package Test.steps.serenity;

import Test.pages.ErrorCheckPage;
import Test.pages.FacebookPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class FacebookCheckErrorStep {

    FacebookPage facebookPage;
    ErrorCheckPage errorCheck;

    @Step
    public void is_the_home_page(){facebookPage.open();}

    @Step
    public void makeLogin(String email, String password){
        facebookPage.getEmailTextField().sendKeys(email);
        facebookPage.getPasswordTextField().sendKeys(password);
        facebookPage.getLoginButton().click();

    }

    @Step
    public void checkError(String error){
        Assert.assertEquals(errorCheck.getErrorMessage(), error);
    }
}
