package pageObject;

import org.openqa.selenium.WebDriver;

import pageUI.*;
import commons.BaseMethod;

public class DesktopPageObject extends BaseMethod{

	private WebDriver driver;
	public DesktopPageObject(WebDriver driver) {
		this.driver = driver;
	}
	public void clickBuildYourComputerLink() {
		waitForElementClickable(driver,DesktopPageUI.BUILD_COMPUTER_LINK);
		clickToElement(driver, DesktopPageUI.BUILD_COMPUTER_LINK);
	}
	
}
