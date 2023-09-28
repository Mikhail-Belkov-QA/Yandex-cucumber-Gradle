import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/scenarios"},
     //   glue = {"com.examples.cucumber"},
plugin = {"pretty"},
publish = true)

public class RunCucumberTest {
}
