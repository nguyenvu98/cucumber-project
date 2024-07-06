package pageObject;

import org.openqa.selenium.WebDriver;

import commons.BaseMethod;

public class NotebookPageObject extends BaseMethod {

	WebDriver driver;

	public NotebookPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToProductLink(WebDriver driver,String locator,String productName) {
		waitForElementClickable(driver,locator,productName);
		clickToElement(driver, locator,productName);
	}

	
}
