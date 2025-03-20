package StepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import PageObjects.CheckoutPage;
import Utils.TextContextSetup;
import io.cucumber.java.en.Then;

public class CheckoutPageSD {
	public WebDriver driver;
	TextContextSetup textContextSetup;
	public CheckoutPage checkoutPage;
	
	public CheckoutPageSD(TextContextSetup textContextSetup)
	{
	this.textContextSetup	= textContextSetup;
	this.checkoutPage = textContextSetup.pageObjectManager.GetCheckoutPage();
	}
	
	@Then("User should be visible with the promocode and place order button")
	public void User_should_visible_with_promocode_and_place_order_button() {
	 
		Assert.assertTrue(checkoutPage.GetApplyButton());
		Assert.assertTrue(checkoutPage.GetPlaceOrderButton());
	}
	
	@Then("^User proceed to the checkout page and verify the (.+) in the page$")
	public void User_proceed_to_checkout_and_verify_the_name_in_page(String shortname) throws InterruptedException {
        checkoutPage.ClickCartIcon();
        checkoutPage.ClickCheckOutButton();
        String ProductName = checkoutPage.GetProductText().split("-")[0].trim();
        Assert.assertTrue(ProductName.contains(shortname));
	}
	
}
