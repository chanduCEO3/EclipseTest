package TestRunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Chandu\\workBook\\CucumberProject\\src\\test",
	glue = {"StepDefs1"},
	plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"},
	monochrome = true)

public class DemoLoginTestRunner {

}
