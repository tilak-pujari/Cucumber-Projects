package testRunOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinition")
public class TestNGTestRunnuer extends AbstractTestNGCucumberTests{

}
