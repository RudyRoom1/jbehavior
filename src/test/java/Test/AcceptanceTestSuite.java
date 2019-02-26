package Test;

import net.serenitybdd.jbehave.SerenityStories;
import net.serenitybdd.jbehave.annotations.Metafilter;
import net.thucydides.core.webdriver.Configuration;

import static net.thucydides.core.ThucydidesSystemProperty.*;

@Metafilter("+debug")
public class AcceptanceTestSuite extends SerenityStories {
    private Configuration configuration;

    public AcceptanceTestSuite() {
        this.configuration = super.getSystemConfiguration();
        configuration.setIfUndefined(WEBDRIVER_DRIVER.getPropertyName(), "provided");
        configuration.setIfUndefined(WEBDRIVER_PROVIDED_TYPE.getPropertyName(), "mydriver");
        configuration.setIfUndefined("webdriver.provided.mydriver", "Test.drivers.ChromeWebDriver");
//        configuration.setIfUndefined(SERENITY_OUTPUT_DIRECTORY.getPropertyName(), "target/site/serenity");
        configuration.setIfUndefined(SERENITY_REPORT_ENCODING.getPropertyName(), "target/site/serenity");
    }
}
