package Test.pages;

import io.vavr.collection.List;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("https://translate.google.com")
public class GoogleTranslatePage extends PageObject {

    @FindBy(css = "[id='sl_list-search-box']")
    private WebElementFacade enterEngLang;

    @FindBy(css = "[id='tl_list-search-box']")
    private WebElementFacade resultUaLang;

    @FindBy(css = "[class='sl-more tlid-open-source-language-list']")
    private WebElementFacade moreButtonEng;

    @FindBy(css = "[class='tl-more tlid-open-target-language-list']")
    private WebElementFacade moreButtonUa;

    @FindBy(css = "[class='cc-ctr normal']")
    private WebElementFacade countField;

    @FindBy(css = "[id='source']")
    private WebElementFacade enterField;

    @FindBy(css = "[class='tlid-translation translation']")
    private WebElementFacade resultField;

    @FindBy(css = "[class='gt-def-row']")
    private List<WebElementFacade> definitionField;

    public WebElementFacade getEnterEngLang() {
        return enterEngLang;
    }

    public WebElementFacade getResultUaLang() {
        return resultUaLang;
    }

    public WebElementFacade getCountField() {
        return countField;
    }

    public WebElementFacade getEnterField() {
        return enterField;
    }

    public WebElementFacade getResultField() {
        return resultField;
    }

    public List<WebElementFacade> getDefinitionField() {
        return definitionField;
    }

    public WebElementFacade getMoreButtonEng() {
        return moreButtonEng;
    }

    public WebElementFacade getMoreButtonUa() {
        return moreButtonUa;
    }
}
