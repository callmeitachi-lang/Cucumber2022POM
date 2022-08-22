	package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:target/cucumber_html_report.html","pretty"}
		,
		features="src/test/java/features",// to have the feature file added
		monochrome=true,
	glue="stepdefinations"
	// to match with the step defination
	//tags="@Books"	
		)
public class Runner {

	/**
	 * 
	 * Cucumber Tags
Tags are used to group the Scenarios into different categories
Tags start with @ 
Provide @SmokeTest tag only for the first scenario in search.feature file and first scenario in softwaretester.feature file
Provide @All tag for all the scenarios in all the feature files
Now provide specific tags like @Books, @Baby, @GoodTester, @AverageTester, @BadTester and @OmayoLogin with respective scenarios in the feature file
Tags can be categorized as Default tags and Custom tags
Examples for Default tags which are used as standard tags are @Dev, @Ignore and @wip
Examples for Custom tags are @Books, @Baby, @GoodTester, @AverageTester, @BadTester and @OmayoLogin
Provide @Ignore tag for Average Tester scenario in softwaretester.feature file
Provide @Dev tag for Baby scenario in search.feature file
Provide @wip tag for Bad Tester scenario in softwaretester.feature file
Update the @CucumberOptions in the Runner.java Class with tags attributes as shown below, for only executing the @SmokeTest tagged scenarios:
@CucumberOptions(plugin={"html:target/cucumber_html_report"}, features="features", glue="stepdefinations", tags={"@SmokeTest"})
Update the @CucumberOptions in the Runner.java Class with tags attributes as shown below, for executing all the scenarios:
@CucumberOptions(plugin={"html:target/cucumber_html_report"}, features="features", glue="stepDefination", tags={"@All"})
Update the @CucumberOptions in the Runner.java Class with tags attributes as shown below, for executing a scenario which is specific to Books:
@CucumberOptions(plugin={"html:target/cucumber_html_report"}, features="features", glue="stepDefination", tags={"@Books"})
Update the @CucumberOptions in the Runner.java Class with tags attributes as shown below, for executing the scenario specific to @Books or @Baby (ORed case)
@CucumberOptions(plugin={"html:target/cucumber_html_report"}, features="features", glue="stepDefination", tags={"@Books,@Baby"})
Update the @CucumberOptions in the Runner.java Class with tags attributes as shown below, for executing the scenarios specified with both @SmokeTest or @Books (ANDed case)
@CucumberOptions(plugin={"html:target/cucumber_html_report"}, features="features", glue="stepDefination", tags={"@SmokeTest","@Books"})
Update the @CucumberOptions in the Runner.java Class with tags attributes as shown below, for executing all the scenarios except @Dev, @wip and @Ignore tagged scenarios 
@CucumberOptions(plugin={"html:target/cucumber_html_report"}, features="features", glue="stepDefination", tags={"@All","~@Dev","~@wip","~@Ignore"})
	 * 
	 */
	
}
