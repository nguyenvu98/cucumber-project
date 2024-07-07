package stepDefinations;

import org.openqa.selenium.WebDriver;

import cucumberOptions.Hooks;

public class LoginPageStep {
	
	WebDriver driver;
	public LoginPageStep() {
		this.driver = Hooks.openAndQuitBrowser();
	}
}
