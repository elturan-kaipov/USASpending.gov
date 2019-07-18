package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber.json ", "html:target/cucumber"},
        features = "src/test/resources/features",
        glue = "step_definitions",
<<<<<<< HEAD
        tags = "@GlossaryFunctionality, @DBDFunctionality",
=======
        tags = "@TC005",
>>>>>>> master
        dryRun = false
                )
public class CukesRunner {

}
