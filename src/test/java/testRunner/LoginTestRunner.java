package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/Login2.feature",glue="stepDefinitions",plugin={"html:target/cucumber-reports","com.cucumber.listener.ExtentCucumberFormatter:Reports/myreport.html"},tags={"@test5"},dryRun=false)
public class LoginTestRunner {

}
