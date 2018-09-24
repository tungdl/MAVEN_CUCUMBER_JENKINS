package cucumberConfigs;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
                        features = "src/test/java/features",
                        glue = "stepDefinitions",
                        monochrome = false,
                        plugin = { "pretty","html:target/site/cucumber-report-default", "json:target/site/cucumber.json"},
                        snippets = SnippetType.CAMELCASE,
                        tags = { "@payment" })

public class RunCucumber {

}