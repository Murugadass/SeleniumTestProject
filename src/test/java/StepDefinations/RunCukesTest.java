package StepDefinations;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json" },
tags = {"@Times"},features = "src/test/resources/Features")

public class RunCukesTest {
	
	

}
