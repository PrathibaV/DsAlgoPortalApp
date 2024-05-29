package dsportal.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
	@CucumberOptions (
			features= "src/test/resources/features",
			glue= {"dsportal/stepdefinition","dsportal/hooks"},
			monochrome= true,
			plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
					"junit:target/test-output/JunitReport/report.xml"}
			)
	public class CucumberRunner {
}
