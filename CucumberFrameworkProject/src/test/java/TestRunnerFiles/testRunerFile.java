package TestRunnerFiles;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./Features/newFeature.feature",glue= {"TestCaseStepDefinitions"}
,plugin = { "pretty","html:target/cucumber-reports.html" }, monochrome=true)
public class testRunerFile {
	

}
