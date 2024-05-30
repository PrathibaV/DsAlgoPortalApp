package dsportal.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features= "src/test/resources/features",
		glue= {"dsportal/stepdefinition","dsportal/hooksForFirefox"},
		
		monochrome= true,
		publish= true,
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"junit:target/test-output/JunitReport/report.xml",
				"html:target/test-output/htmlReport/report.html"}
		)
public class FirefoxRunner {

}
