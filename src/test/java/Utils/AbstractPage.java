package Utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	public WebDriver driver;

	public AbstractPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String CurrentWindowID()
	{
		return driver.getWindowHandle();
	}
	public void SwitchToChild(String parentID)
	{
	Set<String> AllID= driver.getWindowHandles();
	for(String ID:AllID)
	{
		if(!parentID.equals(ID))
		{
			driver.switchTo().window(ID);
		}
	}
		
	}
}
