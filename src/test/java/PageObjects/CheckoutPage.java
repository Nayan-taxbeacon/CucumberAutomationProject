package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	public WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver= driver;
	}

	By Cart = By.xpath("//*[@alt='Cart']");
	By CheckoutBtn = By.xpath("//*[text()='PROCEED TO CHECKOUT']");
	By Applybtn= By.xpath("//*[text()='Apply']");
	By PlaceOrder= By.xpath("//*[text()='Place Order']");
	By productname= By.xpath("//*[@class='product-name']");
	
	public void ClickCartIcon()
	{
		driver.findElement(Cart).click();
	}
	
	public void ClickCheckOutButton()
	{
		 driver.findElement(CheckoutBtn).click();
	}
		
	public Boolean GetApplyButton()
	{
		return driver.findElement(Applybtn).isDisplayed();
	}
	
	public Boolean GetPlaceOrderButton()
	{
		return driver.findElement(PlaceOrder).isDisplayed();
	}
	
	public String GetProductText()
	{
		return driver.findElement(productname).getText();
	}
	
	
	
	
	
	}
