package StepDefination;

import org.testng.Assert;
import PageObjects.LandingPage;
import PageObjects.OfferPage;
import Utils.TextContextSetup;
import io.cucumber.java.en.Then;


public class OfferPageSD {
	
	TextContextSetup textContextSetup;
	
	public OfferPageSD(TextContextSetup textContextSetup)
	{
	this.textContextSetup	= textContextSetup;
	}
	
	@Then("^User search the same product with shortform (.+) in the offer page to check the product exist$")
	public void user_search_the_same_product_with_shortform_in_the_offer_page_to_check_the_product_exist(String Shortname) throws InterruptedException {
	
 		String parentID = textContextSetup.abstractPage.CurrentWindowID();
        LandingPage landingPage = textContextSetup.pageObjectManager.GetLandingPage();
        landingPage.ClickOfferPage();
		Thread.sleep(2000);
	    textContextSetup.abstractPage.SwitchToChild(parentID);
	   // OfferPage offerPage = new OfferPage(textContextSetup.driver);
        OfferPage offerPage = textContextSetup.pageObjectManager.GetOfferPage();
        offerPage.SearchProduct(Shortname);
        String OfferPageResult= offerPage.GetProductText();
		Assert.assertEquals(textContextSetup.ProductPageResult,OfferPageResult);
	}
}
