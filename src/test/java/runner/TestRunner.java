package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin={"html:target/cucumber_html_report.html","pretty"}
		,
		features="src/test/java/features",// to have the feature file added
		monochrome=true,
	glue="stepdefinations",
	// to match with the step defination
	tags="@Books"	
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
