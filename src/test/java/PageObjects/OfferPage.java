package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	
	public WebDriver driver;
	
	public OfferPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	By searchProduct = By.xpath("//*[@id='search-field']");	
	By ProductText = By.xpath("//*[@id='root']/div/div[1]/div/div/div/div/table/tbody/tr/td[1]");
	

	public void SearchProduct(String product)
	{
		driver.findElement(searchProduct).sendKeys(product);
	}
	
	public String GetProductText()
	{
		return driver.findElement(ProductText).getText();
	}
}
