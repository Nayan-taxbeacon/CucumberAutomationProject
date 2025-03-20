package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failed-scenarios.txt",glue="StepDefination", monochrome=true,dryRun=false,tags="@PlaceOrder"
,plugin= {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/failed-scenarios.txt"})

public class FailedTestNGRunner extends AbstractTestNGCucumberTests {
	

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
