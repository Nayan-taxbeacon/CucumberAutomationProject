package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TextContextSetup {

	public WebDriver driver;
	public String ProductPageResult;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public AbstractPage abstractPage;
	
	public TextContextSetup() throws IOException
	{
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.webDriverManager());
		abstractPage = new AbstractPage(testBase.webDriverManager());
	}
}
