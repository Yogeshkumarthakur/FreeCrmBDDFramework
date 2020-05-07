// working fine but if file changed to hooks.feature then hook feature file has some issues
package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Yogesh\\Codes\\FreeCrmBDDFramework\\FreeCrmBDDFramework\\src\\main\\java\\Features\\deals.feature",//path of the features file
        glue = {"StepDefinitions" },// the path or name of the step definition file
        format = { "pretty", "html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml" },//to generate different types of reporting
        monochrome = true, // display the console output in proper readable format
        strict = true,//it will check if any step is not defined in step definition file
        dryRun = false
       // tags = {"~@SmokeTest" , "~@RegressionTest" , "~@End2End"}
        ) //if it is true then check if all the step definition mapped with feature file or not once dryrun = false then u can execute test cases

public class TestRunner {
}
//OR  : tags = {"@SmokeTest , @RegressionTest"}  -- execute all test tagged as @SmokeTest or @Regression Test
//AND : tags = {"@SmokeTest" , "@RegressionTest"}--execute all test tagged as @SmokeTest AND @Regression Test
// if you want to ignore and particular set of testcase then use ~ -- tags = {"~@SmokeTest" , "@RegressionTest"}
// if u want to ignore all tags bucket and run only without tag buckets -- {"~@SmokeTest" , "~@RegressionTest" , "~@End2End"}