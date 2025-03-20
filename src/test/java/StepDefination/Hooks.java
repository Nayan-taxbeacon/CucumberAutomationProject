package StepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.TextContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {

	TextContextSetup testContextSetup;
	
	public Hooks(TextContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
	}
	
	//@After
	public void QuitBrowser() throws IOException
	{
		testContextSetup.testBase.webDriverManager().quit();
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver = testContextSetup.testBase.webDriverManager();
		if(scenario.isFailed())
		{
			File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] FileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(FileContent, "image/png", "image");
			
		}
		
	}
}
