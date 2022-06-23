package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources" }, glue = { "StepDefinations" }, plugin = {
		"json:target/cucumber.json"})
public class TestRunner {

}
