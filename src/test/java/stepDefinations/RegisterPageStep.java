package stepDefinations;

import org.openqa.selenium.WebDriver;

import commons.BaseTest;
import commons.DataHelpers;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObject.PageGeneratorManager;
import pageObject.RegisterPageObject;
import pageUI.RegisterPageUI;

public class RegisterPageStep extends BaseTest{
	
	WebDriver driver;
	RegisterPageObject registerPageObject;
	DataHelpers dataTest;
	static String email,password;
	
	public RegisterPageStep(){
		this.driver = Hooks.openAndQuitBrowser();
		registerPageObject = PageGeneratorManager.getRegisterPageObject(driver);
		dataTest = DataHelpers.getData();
	}
	@When("^Input to Firstname and Lastname textbox$")
	public void inputToFirstnameAndLastnameTextbox(){
		registerPageObject.sendkeyToFirstNameInput(RegisterPageUI.FIRST_NAME_INPUT, dataTest.getFirstName());
		registerPageObject.sendkeyToLastNameInput(RegisterPageUI.LAST_NAME_INPUT, dataTest.getLastName());
	}
	
	@When("^Input to Email textbox$")
	public void inputToEmailTextbox(){
		registerPageObject.sendkeyToEmailInput(RegisterPageUI.EMAIL_INPUT, "abc"+randomNumber()+"@yahoo.com");
	}

	@When("^Input to Password and Confirm Password textbox$")
	public void inputToPasswordAndConfirmPasswordTextbox(){
		password = dataTest.getPassword();
		registerPageObject.sendkeyToPasswordInput(RegisterPageUI.PASSWORD_INPUT, password);
		registerPageObject.sendkeyToConfirmPassInput(RegisterPageUI.CONFIRM_PASSWORD_INPUT, password);
	}

	@When("^Click To Register button$")
	public void clickToRegisterButton(){
		registerPageObject.clickRegisterButton();
	}
	
	@When("^Click To Continue button$")
	public void clickToContinueButton(){
		registerPageObject.clickToContinueButton();

	}

}
