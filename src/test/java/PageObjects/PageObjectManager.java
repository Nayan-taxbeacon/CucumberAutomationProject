package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	public LandingPage landingPage;
	public OfferPage offerPage;
	public CheckoutPage checkoutPage;
	
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;		
	}
	
	public LandingPage GetLandingPage()
	{
		landingPage= new LandingPage(driver);
		return landingPage;
	}
	
	public OfferPage GetOfferPage()
	{
		offerPage= new OfferPage(driver);
		return offerPage;
	}
	
	public CheckoutPage GetCheckoutPage()
	{
		checkoutPage= new CheckoutPage(driver);
		return checkoutPage;
	}
}
