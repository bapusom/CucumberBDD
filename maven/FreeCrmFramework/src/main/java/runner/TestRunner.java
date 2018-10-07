package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/hp/workspace/FreeCrmFramework/src/main/java/features", glue={"stepDefinations"})
public class TestRunner {

}
