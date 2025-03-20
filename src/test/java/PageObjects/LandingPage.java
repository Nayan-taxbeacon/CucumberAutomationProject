package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver= driver;
	}

	By Productname = By.xpath("//*[@id='root']/div/header/div/div[2]/form/input");
	By Productnametext = By.xpath("//*[@id='root']/div/div[1]/div/div/h4");
	By OffersPageLink= By.xpath("//*[@id='root']/div/header/div/div[3]/a[2]");
    By IncremenetIcon = By.cssSelector("a.increment");
    By AddToCart = By.xpath("//*[text()='ADD TO CART']");
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public void SearchProduct(String product)
	{
		driver.findElement(Productname).sendKeys(product);
	}
	
	public String GetProductText()
	{
		return driver.findElement(Productnametext).getText();
	}
	
	public void ClickOfferPage()
	{
		driver.findElement(OffersPageLink).click();
	}
	
	public void IncreamentProductQty(int qty)
	{
		int i= qty-1;
		
		while(i>0)
		{
			driver.findElement(IncremenetIcon).click();
			i--;
		}	
	}
	
	public void AddToCart()
	{
		driver.findElement(AddToCart).click();
	}
	

	}
