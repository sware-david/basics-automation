package testing;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.automation.services.LogService;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
    features = "src/test/resources/feature",
    glue = "repository",
    stepNotifications = false,
    plugin = {"json:target/build/cucumber.json","pretty"},
    tags = "@log-002 or @log-001"
)
public class JunitAutomationTest {

    @BeforeClass
    public static void setUp() {
        LogService.configureLogLevel();
    }

}
