package StepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import PageObjects.LandingPage;
import Utils.TextContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LandingPageSD {
	public WebDriver driver;
	public String ProductPageResult;
	TextContextSetup textContextSetup;
	public LandingPage landingPage;
	
	public LandingPageSD(TextContextSetup textContextSetup)
	{
	this.textContextSetup	= textContextSetup;
    this.landingPage = textContextSetup.pageObjectManager.GetLandingPage();
	}
	
	@Given("User is on the Greencart landing page")
	public void user_is_on_the_greencart_landing_page() {
		Assert.assertTrue(landingPage.getTitle().contains("GreenKart"));
	}
	
	@When("^User search with shortform (.+) in the search field and extract the matching option$")
	public void user_search_with_shortform_in_the_search_field_and_extract_the_matching_option(String shortname) throws InterruptedException {
        landingPage.SearchProduct(shortname);
        Thread.sleep(2000);
		String producttext= landingPage.GetProductText();
		textContextSetup.ProductPageResult= producttext.split("-")[0].trim();
	    System.out.println(ProductPageResult);
	}
	

    @When("User added the quantity {string} for the selected product in cart")
    public void Added_Product_in_Cart(String qty)
	{
		landingPage.IncreamentProductQty(Integer.parseInt(qty));
		landingPage.AddToCart();
	}
	
}
