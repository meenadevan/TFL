import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by ravi on 7/28/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features",tags = {"@journey"},strict = true,plugin = {"json:target/cucumber.json"})
public class RunCukesTest {
}
