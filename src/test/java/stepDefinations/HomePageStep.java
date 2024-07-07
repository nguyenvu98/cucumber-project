package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commons.BaseMethod;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObject.HomePageObject;
import pageObject.PageGeneratorManager;
import pageUI.HomePageUI;

public class HomePageStep extends BaseMethod{
	WebDriver driver;
	HomePageObject homePageObject;
	
	public HomePageStep() {
		this.driver = Hooks.openAndQuitBrowser();
		homePageObject = PageGeneratorManager.getHomePageObject(driver);
	}
	
	@Given("^Open Register page$")
	public void openRegisterPage(){
		homePageObject.clickToHeaderLinkByName("Register");
	}

	@Then("^Homepage is displayed$")
	public void homepageIsDisplayed(){
		waitForElementVisible(driver, HomePageUI.DYNAMIC_HEADER_LINK,"My account");
		Assert.assertTrue(isElementDisplayed(driver, HomePageUI.DYNAMIC_HEADER_LINK,"My account"));
	}
}
