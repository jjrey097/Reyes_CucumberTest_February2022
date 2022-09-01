package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = "steps",
		tags = "@ChangeColorFeauture",
		monochrome = true,        //make console output for the Cucumber test much more readable and remove any unreadable character
		dryRun = false,          //checks for format issues or any compilation errors
		plugin = {
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json"
		}	
		)
public class BackgroundColorRunner {

}
