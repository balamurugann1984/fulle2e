package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\inbg1\\eclipse-workspace\\com.cicd\\Features\\testsign.feature"
		,glue = {"stepDefs"}
		
		)


public class RunTest {

}
