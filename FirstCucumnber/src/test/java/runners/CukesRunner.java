package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json"},
        glue = "step_definitions",
        dryRun = true
)
public class CukesRunner {


}
