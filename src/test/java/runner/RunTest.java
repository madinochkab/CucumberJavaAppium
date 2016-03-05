package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@postAPI",
        glue = {"step_definitions", "hooks", "pages", "support"},
        features = {
                "classpath:cucumber"
        },
        format = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/junit.xml"}
//        dryRun = true
)

public class RunTest extends AbstractTestNGCucumberTests {
}
