package testing;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
    features = "src/test/resources/feature",
    glue = "repository",
    stepNotifications = false,
    plugin = {"json:target/build/cucumber.json","pretty"},
    tags = ""
)
public class JunitAutomationTest {

}
