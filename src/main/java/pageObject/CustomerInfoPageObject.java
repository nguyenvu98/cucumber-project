package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pageUI.*;
import commons.BaseMethod;

public class CustomerInfoPageObject extends BaseMethod {
	private WebDriver driver;
	
	public CustomerInfoPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void selectDropdownDay(WebDriver driver, String locator, String value ) {
		Select selectDay = new Select(getWebElement(driver, locator));
		selectDay.selectByVisibleText(value);
	}

	public void selectDropdownMonth(WebDriver driver2, String locator, String value) {
		Select selectMonth = new Select(getWebElement(driver, locator));
		selectMonth.selectByVisibleText(value);		
	}

	public void selectDropdownYear(WebDriver driver2, String locator, String value) {
		Select selectYear = new Select(getWebElement(driver, locator));
		selectYear.selectByVisibleText(value);		
	}

	public boolean verifySuccessMessage(String message) {
		waitForElementVisible(driver,CustomerInfoPageUI.SUCCESS_MESSAGE);
		return isElementDisplayed(driver, CustomerInfoPageUI.SUCCESS_MESSAGE, message);

	}

}
