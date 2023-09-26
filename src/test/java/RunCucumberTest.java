import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/scenarios/TestYA.feature"},
        glue = {"com.examples.cucumber"},
plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7jvm"})

public class RunCucumberTest {
}
