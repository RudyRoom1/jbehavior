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
//        configuration.setIfUndefined(SERENITY_REPORT_ENCODING.getPropertyName(), "target/site/serenity");
        configuration.setIfUndefined(SERENITY_OUTPUT_DIRECTORY.getPropertyName(), "target/site/serenity");
        configuration.setIfUndefined(SERENITY_DATA_DIR.getPropertyName(), "target/site/serenity");
        configuration.setIfUndefined(SERENITY_REPORT_SHOW_HISTORY.getPropertyName(), "true");
        configuration.setIfUndefined(SERENITY_REPORT_SHOW_PROGRESS.getPropertyName(), "true");
        configuration.setIfUndefined(SERENITY_REPORTS_SHOW_STEP_DETAILS.getPropertyName(), "true");
        configuration.setIfUndefined(SERENITY_REPORT_ENCODING.getPropertyName(), "UTF-8");
        configuration.setIfUndefined(NARRATIVE_FORMAT.getPropertyName(), "ASCIIDOC");
        configuration.setIfUndefined(SERENITY_CONSOLE_COLORS.getPropertyName(), "true");
        configuration.setIfUndefined(WEBDRIVER_TIMEOUTS_IMPLICITLYWAIT.getPropertyName(), "50000");
    }
}
