package pageObject;

import org.openqa.selenium.WebDriver;

import pageUI.*;
import commons.BaseMethod;
import commons.BasePage;

public class MyAccountPageObject extends BaseMethod{
	private WebDriver driver;
	
	public MyAccountPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickToBlockNavigationLinkByName(String pageName) {
		waitForElementClickable(driver, BasePageUI.DYNAMIC_PAGE_MY_ACCOUNT_PAGE, pageName);
		clickToElement(driver, BasePageUI.DYNAMIC_PAGE_MY_ACCOUNT_PAGE, pageName);
	}

	public void clickToAccountNavigation(String string) {
		
	}

	public void clickToHomePage() {
		clickToElement(driver, CustomerInfoPageUI.HOMEPAGE_LINK);
	}
}
